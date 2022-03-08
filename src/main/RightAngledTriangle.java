package main;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		triangleLB(input);
		triangleLU(input);
		triangleRU(input);
		triangleRB(input);
		
		scanner.close();
	}
	
	public static void triangleLB(int input) {
		for (int i=0; i<input; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int input) {
		for (int i=0; i<input; i++) {
			for(int j=5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int input) {
		for (int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				if (j >= i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void triangleRB(int input) {
		for (int i=0; i<input; i++) {
			for(int j=input-1; j>=0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
