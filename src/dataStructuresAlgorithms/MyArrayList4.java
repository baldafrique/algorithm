package dataStructuresAlgorithms;

import java.util.Arrays;
import java.util.Stack;

public class MyArrayList4 {

	public class MyData {
		String key;
		int value;
		public MyData() {
		}
		public MyData(String s, int v) {
			key = s;
			value =v;
		}
		public boolean equals(MyData that) {
			if (this.key==that.key)
				return true;
			else
				return false;
		}
		public int compareTo(MyData that) {
			if (this.key.compareTo(that.key)>0)
				return 1;
			else if (this.key.compareTo(that.key)<0)
				return -1;
			else
				 return 0;
		}
		public String toString() {
			return ""+"("+key+","+value+") ";
		}
	}

	int capacity ;
	MyData [] myArray ;
	MyData [] sorted ;
	int size;
	
	public MyArrayList4(int initialCapacity) {
		capacity = initialCapacity;
		myArray = new MyData[capacity];
		size = 0;
	}
	
	public int indexOf(MyData data) {
		for (int i=0;i<size;i++) {
			if (myArray[i].equals(data))
				return i;
		}
		return -1;
	}
	
	public MyData get(int index) {
		if (checkIndexValidation(index))
			return myArray[index];
		else 
			return null;
	}
	
	private boolean checkIndexValidation(int index) {
		return (index>=0 && index<size)? true:false;
	}
	
	public void set(int index, MyData data) {
		if (checkIndexValidation(index))
			myArray[index]=data;
	}
	public void addFirst(MyData data) {
		add(0, data);
	}
	public void addLast(MyData data) {
		add(data);
	}
	public void add(MyData data) { //save data at the end of array
		if (size==capacity)
			grow(capacity);
		myArray[size]=data;
		size++;
	}
	
	private void grow(int increment) { // �������� �޴´�
		capacity =capacity+ increment;
		myArray = Arrays.copyOf(myArray,capacity);
	}
	
	public void add(int index, MyData data) {
		if (checkIndexValidation(index)) {
			if (size == capacity) 
				grow(capacity);
			makeSlot(index);
			myArray[index]=data;
			size++;
		}
	}
	
	private void makeSlot(int index) {
		for (int i=size-1; i>=index;i--)
			myArray[i+1]=myArray[i];
	}
	
	public MyData removeFirst() {
		return remove(0);
	}
	public MyData removeLast() {
		return remove(size-1);
	}
	
	public MyData remove(int index) {
		MyData ret =null;
		if (checkIndexValidation(index)) {
			ret=myArray[index];
			removeSlot(index);
			size--;
			return ret;
		}
		else 
			return null;
	}
	private void removeSlot(int index) {
		for (int i=index;i<size-1;i++)
			myArray[i]=myArray[i+1];		
	}
	
	public boolean remove(MyData data) {
		int index = indexOf(data);
		return (remove(index)==null) ? false:true ;
	}
	
	public void removeAll() {
		size=0;
	}
	
	public int sizeOf() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public void sort() {  
		// Selection Sort from biggest to smaller..
		for (int i=0; i<size-1;i++) {
			for (int j=i+1; j<size; j++) {
				count++;
				if (myArray[i].compareTo(myArray[j])>0) {
					swap(i, j); 
				}
			}
		}
	}
	
	private void swap(int i, int j) {
		MyData temp = myArray[i];
		myArray[i]=myArray[j];
		myArray[j]=temp;
	}
	
	private class Range {
		int p, r;
		Range (int p, int r) {
			this.p = p;
			this.r = r;
		}
	}

	public void quickSort(int p, int r) {
//		count++;
//		if (p>=r)
//			return;
//		int q=partition(p,r);
//		quickSort(p,q-1);
//		quickSort(q+1,r);
		
		// non-recursive style 1
		Stack<Range> s = new Stack<>();
		s.push(new Range(p, r));
		int q;
		Range t;
		while (!s.isEmpty()) {
			count++;
			t = s.pop();
			if (t.p < t.r) {
				q = partition(t.p, t.r);
				s.push(new Range(q + 1, t.r));
				s.push(new Range(t.p, q - 1));
			}
		}
		
		// non-recursive style 2
//		Stack<Integer> s = new Stack<>();
//		s.push(p);
//		s.push(r);
//		int q, tp, tr;
//		while (!s.isEmpty()) {
//			count++;
//			tr = s.pop();
//			tp = s.pop();
//			if (tp < tr) {
//				q = partition(tp, tr);
//				s.push(q + 1);
//				s.push(tr);
//				s.push(tp);
//				s.push(q - 1);
//			}
//		}
	}
	
	private int partition(int p, int r) {
		int pivot = r;
		int left=p;
		int right=r;
		
		while(left<right) {
			while(myArray[left].compareTo(myArray[pivot])<0 && left<right) {
				left++;
			}
			while(myArray[right].compareTo(myArray[pivot])>=0 && left<right) {
				right--;	
			}
			if (left<right)
				swap(left, right);
		}
		swap(pivot, right);
		return right;
	}
	
	MyData[] temp = new MyData[1000];
	
	private void mergeSort(int p, int r) {
		count++;
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);
		}
	}
	
	private void merge(int p, int q, int r) {
		int k = p;
		int i = p;
		int j = q + 1;
		
		while (i <= q && j <= r) {
			if (myArray[i].compareTo(myArray[j]) < 0) {
				temp[k++] = myArray[i++];
			}
			else {
				temp[k++] = myArray[j++];
			}
		}
		
		while (i <= q) {
			temp[k++] = myArray[i++];
		}
		
		while (j <= r) {
			temp[k++] = myArray[j++];
		}
		
		for (int l = p; l <= r; l++) {
			myArray[l] = temp[l];
		}
	}

//	private void myQuickSortIter(int l, int h) {
//		int[] stack = new int[h - l + 1];
//		
//		int top = -1;
//		
//		stack[++top] = l;
//		stack[++top] = h;
//		
//		while (top >= 0) {
//			count++;
//			
//			h = stack[top--];
//			l = stack[top--];
//			
//			int p = partitionIter(l, h);
//			
//			if (p - 1 > l) {
//				stack[++top] = l;
//				stack[++top] = p - 1;
//			}
//			
//			if (p + 1 < h) {
//				stack[++top] = p + 1;
//				stack[++top] = h;
//			}
//		}
//	}
//	
//	private int partitionIter(int low, int high) {
//		MyData pivot = myArray[high];
//		
//		int i = low - 1;
//		
//		for (int j = low; j <= high - 1; j++) {
//			if (myArray[j].compareTo(pivot) <= 0) {
//				i++;
//				
//				swap(i, j);
//			}
//		}
//		
//		swap(i + 1, high);
//		return i + 1;
//	}
//	
//	private void myMergeSort(int p, int r) {
//		if (p < r) {
//			count++;
//			
//			int q = (p + r) / 2;
//			myMergeSort(p, q);
//			myMergeSort(q + 1, r);
//			myMerge(p, q, r);
//		}
//	}
//	
//	private void myMerge(int p, int q, int r) {
//		int i = p;
//		int j = q + 1;
//		int k = p;
//		
//		while (i <= q && j <= r) {
//			if (myArray[i].compareTo(myArray[j]) < 0) {
//				sorted[k++] = myArray[i++];
//			}
//			else {
//				sorted[k++] = myArray[j++];	
//			}
//		}
//		
//		while (i <= q) {
//			sorted[k++] = myArray[i++];
//		}
//		
//		while (j <= r) {
//			sorted[k++] = myArray[j++];
//		}
//		
//		for (int l = p; l <= r; l++) { 
//			myArray[l] = sorted[l];
//		}
//	}
	
	public String toString() {
		String ret = "";
		for (int i=0;i<size;i++)
			ret = ret +myArray[i].toString()+" ";
		return ret;
	}
	
	int count=0;
	public int getCount() {
		return count;
	}
	public void resetCount() {
		count=0;
	}
	public int seqSearch(MyData data) {
	
		for (int i=0;i<size;i++) {
			count++;
			if (myArray[i].equals(data))
				return i;
		}
		return -1;
	}
	
	public int binarySearch(MyData data, int start, int end) {
		count++;
		if (start>end)
			return -1;
		int m= (start+end)/2;
		if (myArray[m].equals(data))
			return m;
		else if (myArray[m].compareTo(data)>0)
			return binarySearch(data, start, m-1);
		else
			return binarySearch(data, m+1, end);
	}

	
	public static void main(String[] args) {
		int initSize = 10;
		MyArrayList4 al = new MyArrayList4(initSize);
		
		int inputSize=1000;
		MyData[] input = new MyData[inputSize];
		for (int i=0; i<inputSize; i++) {
			int tempD=(int)(inputSize*10*Math.random());
			input[i] = al.new MyData("s"+tempD, tempD);
		}	
		
		for (int i=0; i<inputSize; i++) 
			al.add(input[i]);
		System.out.println(al.toString());
		
		MyData [] temp = new MyData[10];
		int nOfData=0;
		while(nOfData<10) { 
			MyData d=al.get((int)(1000*Math.random()));
			if (d!=null) {
				temp[nOfData]=d;
				nOfData++;
			}
		}
		
		System.out.println("\n<Sequential Search>");
		for (MyData k:temp) {
			al.resetCount();
			System.out.println(k.toString()+" - "+al.seqSearch(k)+" <= "+al.getCount());
		}
		
		al.resetCount();
		al.sort();
		System.out.println("\n<Selection Sort Count> = "+al.getCount());
		System.out.println(al.toString());
		
		System.out.println("\n<Binary Search>");
		for (MyData k:temp) {
			al.resetCount();
			System.out.println(k.toString()+" - "+al.binarySearch(k, 0, al.sizeOf()-1)+" <= "+al.getCount());
		}
		
		al.removeAll();
		System.out.println("\nInput Again !");
		for (int i=0; i<inputSize; i++) 
			al.add(input[i]);
		System.out.println(al.toString());

		al.resetCount();
		al.quickSort(0,inputSize-1);
		System.out.println("\n<QuickSort Count> = "+al.getCount());
		System.out.println(al.toString());
		
		al.removeAll();
		System.out.println("\nInput Again !");
		for (int i=0; i<inputSize; i++) 
			al.add(input[i]);
		System.out.println(al.toString());

		al.resetCount();
		al.quickSort(0,inputSize-1);
		System.out.println("\n<QuickSortIter Count> = "+al.getCount());
		System.out.println(al.toString());
		
		al.removeAll();
		System.out.println("\nInput Again !");
		for (int i=0; i<inputSize; i++) 
			al.add(input[i]);
		System.out.println(al.toString());

		al.resetCount();
		al.sorted = new MyData[al.myArray.length];
		al.mergeSort(0,inputSize-1);
		System.out.println("\n<MergeSort Count> = "+al.getCount());
		System.out.println(al.toString());
		
		System.out.println("\n<Binary Search>");
		for (MyData k:temp) {
			al.resetCount();
			System.out.println(k.toString()+" - "+al.binarySearch(k, 0, al.sizeOf()-1)+" <= "+al.getCount());
		}
	}
}
