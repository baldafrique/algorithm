package dataStructuresAlgorithms;

import java.util.Arrays;

public class MyArrayList3 {
	int capacity;
	MyData[] myArray;
	int size;
	
	public MyArrayList3(int initialCapacity) {
		capacity = initialCapacity;
		myArray = new MyData[capacity];
		size = 0;
	}
	
	public int indexOf(MyData data) {
		for (int i = 0; i < size; i++) {
			if (myArray[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	
	public MyData get(int index) {
		if (checkIndexValidation(index)) {
			return myArray[index];
		}
		else {
			return null;	
		}
	}
	
	private boolean checkIndexValidation(int index) {
		return index >= 0 && index < size ? true : false;
	}

	public void set(int index, MyData data) {
		myArray[index] = data;
	}
	
	public void addFirst(MyData data) {
		add(0, data);
	}
	
	public void addLast(MyData data) {
		add(data);
	}
	
	public void add(MyData data) { // save data at the end of array
		if (size == capacity) {
			grow(capacity);
		}
		myArray[size] = data;
		size++;
	}
	
	private void grow(int increment) {
		capacity += increment;
		myArray = Arrays.copyOf(myArray, capacity);
	}

	public void add(int index, MyData data) {
		if (checkIndexValidation(index)) {
			if (size == capacity) {
				grow(capacity);
			}
			makeSlot(index);
			myArray[index] = data;
			size++;
		}
	}
	
	private void makeSlot(int index) {
		for (int i = size - 1; i >= index; i--) {
			myArray[i+1] = myArray[i];
		}
	}
	
	public MyData removeFirst() {
		return remove(0);
	}
	
	public MyData removeLast() {
		return remove(size - 1);
	}

	public MyData remove(int index) {
		MyData ret = null;
		if (checkIndexValidation(index)) {
			ret = myArray[index];
			removeSlot(index);
			size--;
			return ret;
		}
		else {
			return null;
		}
	}
	
	private void removeSlot(int index) {
		for (int i = index; i < size - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
	}

	public boolean remove(MyData data) {
		int index = indexOf(data);
		return remove(index) == null ? false : true;
	}
	
	public int sizeOf() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public void sort() {
		// selection sort from biggest to smaller..
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (myArray[i].compareTo(myArray[j]) < 0) {
					swap(i, j);
				}
			}
		}
	}
	
	private void swap(int i, int j) {
		MyData temp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = temp;
	}

	public String toString() {
		String ret = "";
		for (int i = 0; i < size; i++) {
			ret += myArray[i] + " ";
		}
		return ret;
	}
}
