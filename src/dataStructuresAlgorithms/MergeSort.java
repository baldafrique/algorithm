package dataStructuresAlgorithms;

public class MergeSort {
	private static int[] unsorted;
	private static int[] sorted;
	
	private static void mergeSort(int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);	
		}
	}
	
	private static void merge(int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int k = p;
		
		while (i <= q && j <= r) {
			if (unsorted[i] < unsorted[j]) {
				sorted[k++] = unsorted[i++];
			}
			else {
				sorted[k++] = unsorted[j++];
			}
		}
		
		while (i <= q) {
			sorted[k++] = unsorted[i++];
		}
		
		while (j <= r) {
			sorted[k++] = unsorted[j++];
		}
		
		for (int l = p; l <= r; l++) {
			unsorted[l] = sorted[l];
		}
	}

	public static void main(String[] args) {
		unsorted = new int[]{7, 15, 12, 4, 8, 1, 5, 9, 3, 6, 10, 13, 2, 14, 11};
		sorted = new int[unsorted.length];
		mergeSort(0, unsorted.length - 1);
		for (int i : unsorted) {
			System.out.print(i + " ");
		}
	}

}
