package codeUp;

import java.util.Scanner;

public class CodeUp4501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] heights = new int[7];
		int temp;
		
		for(int i=0; i<7; i++) heights[i] = scanner.nextInt();
		
		for(int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if(heights[j] < heights[j+1]) {
					temp = heights[j];
					heights[j] = heights[j+1];
					heights[j+1] = temp;
				}
			}
		}
		
		System.out.print(heights[0]+"\n"+heights[1]);
		scanner.close();
	}

}