package dataStructuresAlgorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class Heap2 {
	
	class Node {
		char key;
		Node left;
		Node right;
		Node parent;
		
		Node(char v, Node l, Node r, Node p) {
			this.key = v;
			this.left = l;
			this.right = r;
			this.parent = p;
		}
		
		public String toString() {
			return " " + key;
		}
	}
	
	Node heap, last;
	
	public Heap2() {
		heap = null;
		last = null;
	}
	
	private void insert(char x) {
		Node pNext; // parent of new node
		
		if (heap == null) {
			heap = new Node(x, null, null, null);
			last = heap;
			pNext = null;
		}
		else if (last == heap) {
			heap.left = new Node(x, null, null, heap);
			last = heap.left;
			pNext = heap;
		}
		else if (last == last.parent.left) {
			last.parent.right = new Node(x, null, null, last.parent);
			last = last.parent.right;
			pNext = last.parent;
		}
		else {
			pNext = last; 
			while (pNext.parent != null && pNext.parent.right == pNext) {
				pNext = pNext.parent;
			}
			if (pNext.parent != null) {
				pNext = pNext.parent.right;
			}
			while (pNext.left != null) {
				pNext = pNext.left;
			}
			pNext.left = new Node(x, null, null, pNext);
			last = pNext.left;
		}
		
		heapifyUpward(last);
		showHeap();
	}
	
	private void heapifyUpward(Node node) {
		if (node == null || node.parent == null) {
			return;
		}
		else if (node.key > node.parent.key) {
			swap(node, node.parent);
			heapifyUpward(node.parent);
		}
	}
	
	private void swap(Node a, Node b) {
		char temp = a.key;
		a.key = b.key;
		b.key = temp;
	}
	
	private Character delete() {
		if (heap == null) {
			return null;
		}
		
		char retValue = heap.key;
		heap.key = last.key;
		
		if (last == heap) {
			heap = null;
			last = null;
		}
		else if (last == last.parent.right) {
			last.parent.right = null;
			last = last.parent.left;
		}
		else if (last == last.parent.left) {
			Node node = last;
			Node parent = last.parent;
			
			while (node.parent != null && node.parent.left == node) {
				node = node.parent;
			}
			if (node.parent != null) {
				node = node.parent.left;
			}
			while (node.right != null) {
				node = node.right;
			}
			last = node;
			parent.left = null;
		}
		
		heapifyDownward(heap);
		return retValue;
	}
	
	private void heapifyDownward(Node node) {
		if (node == null || node.left == null) {
			return;
		}
		else {
			Node bigger = node.left;
			if (node.right != null && node.right.key > node.left.key) {
				bigger = node.right;
			}
			if (node.key < bigger.key) {
				swap(node, bigger);
				heapifyDownward(bigger);
			}
		}
	}
	
	private void showHeap() {
		System.out.println(levelOrderTraverse(heap));
	}

	private String levelOrderTraverse(Node node) {
		if (heap == null) {
			return null;
		}
		else {
			Deque<Node> q = new ArrayDeque<>();
			q.add(heap);
			return levelOrderTraverse(q, "");
		}
	}
	
	private String levelOrderTraverse(Deque<Node> q, String string) {
		// Recursion
		if (q.isEmpty()) {
			return string;
		}
		else {
			Node node = q.poll();
			string += node.toString();
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
			return levelOrderTraverse(q, string);
		}
	
		// Iteration
//		while (!q.isEmpty()) {
//			Node node = q.poll();
//			string += node.toString();
//			if (node.left != null) {
//				q.add(node.left);
//			}
//			if (node.right != null) {
//				q.add(node.right);
//			}
//		}
//		return string;
	}
	
	public static void main(String[] args) {
		Heap2 h = new Heap2();
		
		for (int i = 0; i < 26; i++) {
			h.insert((char)((int)'A' + i));
		}
		
		System.out.println("\nHeap Created : ");
		h.showHeap();
		
		System.out.println("\nSort (Max.Heap) : ");
		Character c;
		while ((c = h.delete()) != null) {
			System.out.print(c + " deleted : ");
			h.showHeap();
		}
	}

}
