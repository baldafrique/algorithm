package dataStructuresAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data = {2, 5, 7, 3, 9, 1, 8};
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(data));
	}

}
