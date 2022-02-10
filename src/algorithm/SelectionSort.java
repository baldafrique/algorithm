package algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] n = {2, 4, 5, 3, 1};
		int tmp;
		
		for (int i=0; i<n.length-1; i++) { // i : �ּҰ��� ��ġ��ų ���� ���� index
			for (int j=i+1; j<5; j++) { // j : �� ���� index(i)�� ���� index
				if (n[i] > n[j]) {
					tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
		
	}

}
