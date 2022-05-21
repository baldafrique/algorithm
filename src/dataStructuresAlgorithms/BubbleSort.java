package dataStructuresAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = {2, 5, 7, 3, 9, 1, 8};
		
		// 가장 큰 값을 가장 오른쪽으로 보내는 작업을 재귀적으로 수행
		for (int i = data.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}

}
