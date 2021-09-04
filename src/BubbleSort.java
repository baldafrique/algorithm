package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int n[] = {6, 4, 7, 9, 1};
		
		for (int i=n.length-1; i>=0; i--) {
			for (int j=0; j<i; j++) {
				if (n[j] > n[j+1]) {
					swap(n, j, j+1);
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
	
	public static void swap(int[] n, int k, int j) {
		int tmp = n[k];
		n[k] = n[j];
		n[j] = tmp;
	}

}
