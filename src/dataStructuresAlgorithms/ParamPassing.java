package dataStructuresAlgorithms;

import java.util.Arrays;

public class ParamPassing {
	int[] data, newData;
	
	public ParamPassing(int[] array, int n) {
		data = array;
		newData = Arrays.copyOf(array, array.length);
		n = -1;
	}
	
	private void change1() {
		for (int i = 0; i < newData.length; i++) {
			newData[i] = - newData[i];
		}
	}
	
	public void change2() {
		for (int i = 0; i < data.length; i++) {
			data[i] = -data[i];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int newLen = 10;
		
		ParamPassing me = new ParamPassing(arr1, newLen);
		printArray("0", arr1);
		System.out.println(newLen);
		
		me.change1();
		printArray("1", arr1);
		System.out.println(newLen);
		
		me.change2();
		printArray("2", arr1);
		System.out.println(newLen);
		
	}

	private static void printArray(String c, int[] arr) {
		System.out.print("CASE " + c + ": ");
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
