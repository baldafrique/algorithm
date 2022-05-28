package dataStructuresAlgorithms;

import java.util.ArrayList;

public class MyHeap {
	ArrayList<Character> heap = new ArrayList<>();
	private static int lastNodeIndex = 0;
	
	public MyHeap() {
		heap.add(null);
	}
	
	public void insert(char x) {
		int emptyIndex = heap.size();
		heap.add(emptyIndex, x);
		heapifyUpward(emptyIndex);
		lastNodeIndex++;
		showHeap();
	}
	
	private void heapifyUpward(int i) {
		int parentIndex = i / 2;
		if (parentIndex > 0) {
			if (heap.get(i) > heap.get(parentIndex)) {
				swap(parentIndex, i);
				heapifyUpward(parentIndex);
			}
		}
	}
	
	private void heapifyDownward(int i) {
		int leftChildIndex = 2 * i;
		int rightChildIndex = 2 * i + 1;
		
		
		if (leftChildIndex <= lastNodeIndex && heap.get(rightChildIndex) != null && heap.get(i) < heap.get(leftChildIndex)) {
			swap(leftChildIndex, i);
			heapifyDownward(leftChildIndex);
		}
		else if (leftChildIndex <= lastNodeIndex && heap.get(rightChildIndex) != null && heap.get(i) < heap.get(rightChildIndex)) {
			swap(rightChildIndex, i);
			heapifyDownward(rightChildIndex);
		}
	}
	
	private void swap(int i, int j) {
		char temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public Character delete() {
		Character root = heap.get(1);
		
		if (root != null) {
			heap.set(1, heap.get(lastNodeIndex));
			heap.set(lastNodeIndex, null);
			heapifyDownward(1);
		}
		
		lastNodeIndex--;
		return root;
	}
	
	public void showHeap() {
		System.out.println(heap);
	}
	
	public static void main(String[] args) {
		MyHeap h = new MyHeap();
		
		for (int i = 0; i < 26; i++) {
			h.insert((char) ((int)'A' + i));
		}
		
		System.out.println("\nHeap Created : ");
		h.showHeap();
		
		System.out.println("\nSort [Max.Heap] ");
		Character c;
		while ((c = h.delete()) != null) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n\nAfter delete : ");
		h.showHeap();
		
	}
}
