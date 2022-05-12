package dataStructuresAlgorithms;

public class QuickSort {
	private static void quickSort(int[] data, int p, int r) {
		if (p >= r) {
			return;
		}
		
		int q = partition(data, p, r);
		quickSort(data, p, q - 1);
		quickSort(data, q + 1, r);
	}

	private static int partition(int[] data, int p, int r) {
		int pivot = r;
		int left = p;
		int right = r;
		
		while (left < right) {
			while (data[left] < data[pivot] && left < right) {
				left++;
			}
			
			while (data[right] > data[pivot] && left < right) {
				right--;
			}
			
			if (left < right) {
				swap(data, left, right);
			}
		}
		
		swap(data, pivot, right);
		return right;
	}
	
	private static void swap(int[] data, int left, int right) {
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}

	public static void main(String[] args) {
		int[] data = {9, 4, 15, 2, 8, 3, 7, 1, 14, 12, 13};
		
		for (int i : data) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		quickSort(data, 0, data.length - 1);
		
		for (int i : data) {
			System.out.print(i + " ");
		}
	}

}
