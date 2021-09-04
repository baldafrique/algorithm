package algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] n = {2, 4, 5, 3, 1};
		int tmp;
		
		for (int i=0; i<n.length-1; i++) { // i : 최소값을 위치시킬 가장 앞의 index
			for (int j=i+1; j<5; j++) { // j : 맨 앞의 index(i)와 비교할 index
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
