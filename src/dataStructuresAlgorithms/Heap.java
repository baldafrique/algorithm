package dataStructuresAlgorithms;

import java.util.ArrayList;

public class Heap {
	ArrayList<Character> heap = new ArrayList<>();
	
	public Heap() {
		heap.add(null);
	}
	
	public void insert(char x) {
		int emptyIndex = heap.size();
		heap.add(emptyIndex, x);
		heapifyUpward(emptyIndex);
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
	
	private void swap(int i, int j) {
		char temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public Character delete() {
		return null;
	}
	
	public void showHeap() {
		System.out.println(heap);
	}
	
	public static void main(String[] args) {
		Heap h = new Heap();
		
		for (int i = 0; i < 26; i++) {
			h.insert((char) ((int)'A' + i));
		}
		
		System.out.println("\nHeap Created : ");
		h.showHeap();
		
//		System.out.println("\nSort [Max.Heap] ");
//		Character c;
//		while ((c = h.delete()) != null) {
//			System.out.print(c + " ");
//		}
	}
}
