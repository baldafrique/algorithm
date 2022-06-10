package dataStructuresAlgorithms;
import java.util.ArrayDeque;
import java.util.Deque;

public class FinalsHeap2 {
	
	public class Node {
		char key;
		Node left;
		Node right;
		Node parent;
		
		public Node(char v, Node l, Node r, Node p) {
			key=v;
			left=l;
			right=r;
			parent =p;
		}
		
		public String toString() {
			return " "+key;
		}
	}
	
	Node heap, last;
	
	public FinalsHeap2() {
		heap=null;
		last=null;
	}
	
	public void insert(char x) {
		Node pNext; // parent of new node
		
		if (heap==null) {
			heap=new Node (x, null,null,null);
			last=heap;
			pNext=null;
		}
		else if (heap==last) {
			heap.left=new Node(x, null, null, heap);
			last=heap.left;
			pNext=heap;
		}
		else if (last==last.parent.left) {
			last.parent.right=new Node(x, null, null, last.parent);
			last = last.parent.right;
			pNext= last.parent;
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
		if (node==null || node.parent==null)
			return;
		
		if (node.key>node.parent.key) {
			swap(node, node.parent);
			heapifyUpward(node.parent);
		}
	}
	
	private void swap(Node a, Node b) {
		char temp=a.key;
		a.key=b.key;
		b.key=temp;
	}
	
	public Character delete() { 
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
		if (node==null||node.left==null)
			return;
		Node bigger = node.left;
		if (node.right!=null && node.right.key>node.left.key)
			bigger=node.right;
		if (bigger.key>node.key) {
			swap(bigger, node);
			heapifyDownward(bigger);
		}
	}
	
	public void showHeap() {
		System.out.println(levelOrderTraverseI(heap));
	}

	private String levelOrderTraverseI(Node root) { 
		if (heap == null) {
			return null;
		}
		
		String string = "";
		
		Deque<Node> q = new ArrayDeque<>();
		q.add(heap);
		
		while (!q.isEmpty()) {
			Node node = q.poll();
			string += node.toString();
			
			if (node.left != null) {
				q.add(node.left);
			}
			
			if (node.right != null) {
				q.add(node.right);
			}
		}
		
		return string;
	}
	
	public int countsubTreeNodes(char c) {
		Node node = getNode(heap, c);
		return countsubTreeNodes(node);
	}

	private Node getNode(Node node, char c) {
		if (node.key == c) {
			return node;
		}
		
		Node left = null;
		Node right = null;
		
		if (node.left != null) {
			left = getNode(node.left, c);
		}
		
		if (node.right != null) {
			right = getNode(node.right, c);
		}

		if (left == null && right == null) {
			return null;
		}
		else {
			return left == null ? right : left;
		}
	}

	private int countsubTreeNodes(Node node) {
		if (node==null)
			return 0;
		else 
			return 1+countsubTreeNodes(node.left)+countsubTreeNodes(node.right);
	}
	
	public static void main(String[] args) {
		FinalsHeap2 h = new FinalsHeap2();

		for (int i=0;i<26;i++) {
			h.insert((char)((int)'A'+i));
		}

		System.out.println("\nTree Created : " );
		h.showHeap();
		
		System.out.println("\nNumber of Nodes from "+'Z'+" : "+h.countsubTreeNodes('Z'));
		System.out.println("\nNumber of Nodes from "+'V'+" : "+h.countsubTreeNodes('V'));
		System.out.println("\nNumber of Nodes from "+'Q'+" : "+h.countsubTreeNodes('Q'));
		System.out.println("\nNumber of Nodes from "+'R'+" : "+h.countsubTreeNodes('R'));
		
		
		System.out.println("\nSort (Max.Heap) : " );
		Character c;
		while((c=h.delete()) != null) {
			System.out.print(c+" deleted : ");
			h.showHeap();
		}
	}
}

