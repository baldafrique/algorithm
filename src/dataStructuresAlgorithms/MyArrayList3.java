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
		/* original indexOf()
		for (int i = 0; i < size; i++) {
			if (myArray[i].equals(data)) {
				return i;
			}
		}
		return -1;
		*/
		
		return binarySearch(data, 0, sizeOf() - 1);
	}
	
	private int binarySearch(MyData data, int low, int high) {
		int mid;
		
		if (low <= high) {
			mid = (low + high) / 2;
			
			if (data.equals(get(mid))) {
				return mid;
			}
			else if (data.compareTo(get(mid)) > 0) {
				return binarySearch(data, low, mid - 1);
			}
			else {
				return binarySearch(data, mid + 1, high);
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
		/* original sort() 
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (myArray[i].compareTo(myArray[j]) < 0) {
					swap(i, j);
				}
			}
		}
		*/
		
		quickSort(0, sizeOf() - 1);
	}
	
	private void quickSort(int left, int right) {
		if (left < right) {
			int newPivot = partition(left, right);
			quickSort(left, newPivot - 1);
			quickSort(newPivot + 1, right);
		}
	}
	
	private int partition(int left, int right) {
		int pivot = (left + right) / 2;
		
		while (left < right) {
			
			while (left <= right && get(left).compareTo(get(pivot)) >= 0) {
				++left;
			}
			
			while (left <= right && get(right).compareTo(get(pivot)) < 0) {
				--right;
			}
			
			if (left <= right) {
				swap(left, right);
				
				if (right == pivot) {
					return left;
				}
			}
		}
		
		if (right != pivot) {
			swap(right, pivot);
		}
		return right;
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
	
	public static void main(String[] args) {
		MyArrayList3 al = new MyArrayList3(10);
		
		al.add(new MyData("xyz", 10));
		al.add(new MyData("abc", 10));
		al.add(new MyData("def", 20));
		al.add(new MyData("ghi", 30));
		al.add(new MyData("jkl", 40));
		
		System.out.println(al.toString());
		al.sort();
		System.out.println(al.toString());
		System.out.println(al.indexOf(new MyData("def", 20)));
		System.out.println(al.indexOf(new MyData("ghi", 30)));
		System.out.println(al.indexOf(new MyData("xyz", 0)));
	}
}
