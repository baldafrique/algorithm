package main;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		for (int i=1; i<=input; i++) {
			for (int j=1; j<input*2; j++) {
				if (j <= input-i) {
					System.out.print(" ");
				} 
				else if (j > (input-i) + i*2-1) {
					System.out.print(" ");
				} 
				else {
//					System.out.print("*");
					System.out.print(i%10);
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}

/*
@@@@*@@@@ 1 input-i/2i-1/input-i
@@@***@@@ 3	input-i/2i-1/input-i
@@*****@@ 5 
@*******@ 7
********* 9
*/