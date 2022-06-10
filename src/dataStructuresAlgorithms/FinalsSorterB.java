package dataStructuresAlgorithms;
import java.util.Random;

public class FinalsSorterB {
	
	static int [] input;
	static int [] temp;
	
	public FinalsSorterB(int [] data) {
		input=new int[data.length];
		temp=new int[data.length];
		System.arraycopy(data, 0, input, 0, data.length);
	}
	
	public int[] sort() {
		return mergeSort(0, input.length - 1);
	}

	private int[] mergeSort(int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);	
		}
		return input;
	}
	
	private static void merge(int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int k = p;
		
		while (i <= q && j <= r) {
			if (input[i] < input[j]) {
				temp[k++] = input[i++];
			}
			else {
				temp[k++] = input[j++];
			}
		}
		
		while (i <= q) {
			temp[k++] = input[i++];
		}
		
		while (j <= r) {
			temp[k++] = input[j++];
		}
		
		for (int l = p; l <= r; l++) {
			input[l] = temp[l];
		}
	}

	public static void main(String[] args) {
		int max=30;
		Random rand = new Random(7);
		int[] data = new int [max];

		System.out.println("<Before Sorting>");
		for (int i=0;i<max;i++) {
			data[i]=rand.nextInt(1000);
			System.out.printf("%5d", data[i]);
		}
		System.out.println();
		
		FinalsSorterB s = new FinalsSorterB(data);
		int [] sortedData= s.sort();
		System.out.println("<After Sorting>");
		for (int i=0;i<max;i++) {
			System.out.printf("%5d", sortedData[i]);
		}
	}

}

