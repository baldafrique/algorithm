package algorithm;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int container;
		
		for (int i=0; i<array.length/2; i++) {
			container = array[i];
			array[i] = array[array.length-(i+1)];
			array[array.length-(i+1)] = container;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
