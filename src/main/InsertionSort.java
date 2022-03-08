package main;

import java.util.Arrays;

public class InsertionSort {
	
	public static void swap(int[] n, int k, int j) {
		int tmp = n[k];
		n[k] = n[j];
		n[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] n = {8, 1, 2, 5, 4, 3, 6, 7};
		for (int i=1; i<n.length; i++) {
			int j = i;
			for (int k=i-1; k>=0; k--) {
				if (n[k] > n[j]) {
					swap(n, k, j);
					j = k;
				}
				else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
	

	

}
