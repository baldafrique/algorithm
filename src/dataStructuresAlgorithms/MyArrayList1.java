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
	
	public int get(int index) {
		return elementData[index];
	}
	
	public int indexOf(int data) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == data) {
				return i;
			}
		}
		return -1;
	}

	public int add(int data) {
		// grow
		if (size == currCapacity) {
			currCapacity *= 2;
			int[] newArray = new int[currCapacity];
			for (int i = 0; i < size; i++) {
				newArray[i] = elementData[i];
			}
			elementData = newArray;
		}
		
		elementData[size++] = data;
		return size - 1;
	}
	
	public void add(int index, int data) {
		// 용량이 부족하면 grow

		// index ~ size는 하나씩 뒤로 copy
		
		// index에 data 기록
	}
	
	public int remove(int index) {
		int retValue = elementData[index]; // return value
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		return retValue;
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
