package dataStructuresAlgorithms;

public class MyLinkedList0 {
	int capa = 20;
	int[][] mPool;
	int freePointer;
	int listPointer;
	int size;
	
	public MyLinkedList0() {
		mPool = new int[capa][2];
		initPool();
		freePointer = 0;
		listPointer = -1;
		size = 0;
	}

	private void initPool() {
		for (int i = 0; i < capa - 1; i++) {
			mPool[i][1] = i + 1;
		}
		mPool[capa - 1][1] = -1;
	}
	
	public int add(int data) { // addLast, return index
		int index = 0;
		if (freePointer == -1) {
			System.out.println("Out-of-Memory!");
			return -1;
		}
		else {
			if (listPointer == -1) {
				listPointer = freePointer;
				freePointer = mPool[freePointer][1]; // new free ptr
				mPool[listPointer][0] = data;
				mPool[listPointer][1] = -1;
			}
			else {
				int temp = listPointer;
				while (mPool[temp][1] != -1) {
					temp = mPool[temp][1];
					index++;
				}
				mPool[temp][1] = freePointer;
				freePointer = mPool[freePointer][1];
				temp = mPool[temp][1];
				mPool[temp][0] = data;
				mPool[temp][1] = -1;
			}
			size++;
			return index;
		}
	}
	
	public int addFirst(int data) {
		if (freePointer == -1) {
			System.out.println("Out-of-Memory!");
			return -1;
		}
		else {
			int temp = listPointer;
			listPointer = freePointer;
			freePointer = mPool[freePointer][1];
			mPool[listPointer][0] = data;
			mPool[listPointer][1] = temp;
			size++;
			return 0;
		}
	}
	
	public String toString() {
		String ret = "";
		int temp = listPointer;
		while (temp != -1) {
			ret += mPool[temp][0] + ", ";
			temp = mPool[temp][1];
		}
		return ret;
	}
}
