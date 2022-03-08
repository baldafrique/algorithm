package codeUp;

import java.util.Scanner;

public class CodeUp1094 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		for(int i=0; i<number; i++) {
			numbers[i] = scanner.nextInt();
		}
		for(int i=number-1; i>=0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		scanner.close();
	}

}