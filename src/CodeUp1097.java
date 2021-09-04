package algorithm;

import java.util.Scanner;

public class CodeUp1097 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] plate = new int[19][19];
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				plate[i][j] = scanner.nextInt();
			}
		}
		
		
		int number = scanner.nextInt();
		int x, y;
		
		for(int m=0; m<number; m++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			for(int k=0; k<19; k++) {
				if(plate[k][y-1] == 0) plate[k][y-1] = 1;
				else plate[k][y-1] = 0;
				if(plate[x-1][k] == 0) plate[x-1][k] = 1;
				else plate[x-1][k] = 0;
			}
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