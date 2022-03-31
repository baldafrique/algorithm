package dataStructuresAlgorithms;

public class MyArrayList1 {

	int initCapacity = 10;
	int currCapacity;
	int[] elementData;
	int size; // # of data added
	
	public MyArrayList1() {
		elementData = new int[initCapacity];
		currCapacity = initCapacity;
		size = 0;
	}
	
	public String get(int index) {
		return null;
	}
	
	public int search(int data) {
		return 0;
	}
	
	public void add(int data) {
		if (size == currCapacity) {
			currCapacity *= 2;
			int[] newArray = new int[currCapacity];
			for (int i = 0; i < size; i++) {
				newArray[i] = elementData[i];
			}
			elementData = newArray;
		}
		else {
			elementData[size++] = data;
		}
	}
	
	public void add(int index, int data) {
		
	}
	
	public String remove(int index) {
		return null;
	}
	
	public int sizeOf() {
		return size;
	}
	
	public int arrSize() {
		return currCapacity;
	}
	
	public String toString() {
		String ret = "";
		for (int i = 0; i < size; i++) {
			ret += elementData[i] + ", ";
		}
		return ret;
	}
	
}
