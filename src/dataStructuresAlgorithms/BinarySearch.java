package dataStructuresAlgorithms;

public class BinarySearch {
	
	private static int binarySearch(int[] data, int value, int start, int end) {
		int middle = (start + end) / 2;
		
		if (start > end) {
			return -1;
		}
		else if (data[middle] == value) {
			return middle;
		}
		else if (value < data[middle]) {
			return binarySearch(data, value, start, middle - 1);
		}
		else {
			return binarySearch(data, value, middle + 1, end);	
		}
	}

	public static void main(String[] args) {
		int[] data = {1, 3, 7, 12, 16, 21, 28, 35, 42, 49, 53};
		int value = 28;
		int index = binarySearch(data, value, 0, data.length - 1);
		System.out.println(index);
	}

}
