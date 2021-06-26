package algorithm;

import java.util.Scanner;

public class CodeUp1098 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int[][] plate = new int[width][height];
		int number = scanner.nextInt();
		
		int length, direction, x, y;
		
		for(int i=0; i<number; i++) {
			length = scanner.nextInt();
			direction = scanner.nextInt();
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			if(direction == 0) {
				for(int j=y-1; j<y+length-1; j++) {
					plate[x-1][j] = 1;
				}
			}
			else {
				for(int j=x-1; j<x+length-1; j++) {
					plate[j][y-1] = 1;
				}
			}
		}
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				System.out.print(plate[i][j] + " ");
			}
			System.out.println();
		}
		
		
		scanner.close();
	}

}