package dataStructuresAlgorithms;

import java.util.ArrayList;

public class Heap1 {
	ArrayList<Character> heap = new ArrayList<>();
	
	public Heap1() {
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
	
	private void heapifyDownward(int i) {
		int bigger = 2 * i; // left child
		if (bigger >= heap.size()) {
			return;
		}
		if ((bigger + 1) < heap.size() && heap.get(bigger + 1) > heap.get(bigger)) {
			bigger++;
		}
		if (heap.get(bigger) > heap.get(i)) {
			swap(bigger, i);
			heapifyDownward(bigger);
		}
	}
	
	private void swap(int i, int j) {
		char temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public Character delete() {
		if (heap.size() <= 1) {
			return null;
		}
		char retValue = heap.get(1);
		if (heap.size() == 2) {
			heap.remove(1);
		}
		else {
			heap.set(1,  heap.remove(heap.size() - 1));
			heapifyDownward(1);
		}
		return retValue;
	}
	
	public void showHeap() {
		System.out.println(heap);
	}
	
	public static void main(String[] args) {
		Heap1 h = new Heap1();
		
		for (int i = 0; i < 26; i++) {
			h.insert((char) ((int)'A' + i));
		}
		
		System.out.println("\nHeap Created : ");
		h.showHeap();
		
		System.out.println("\nSort [Max.Heap] ");
		Character c;
		while ((c = h.delete()) != null) {
			System.out.print(c + " deleted : ");
			h.showHeap();
		}
	}
}
