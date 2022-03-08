package codeUp;

import java.util.Scanner;

public class CodeUp1096 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] plate = new int[19][19];
		int number = scanner.nextInt();
		int x, y;
		
		for(int i=0; i<number; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			plate[x-1][y-1] = 1;
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(plate[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}