package codeUp;

import java.util.Scanner;

public class CodeUp1440 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] num = new int[input];
		for(int i=0; i<input; i++) num[i] = scanner.nextInt();
		
		for(int i=0; i<input; i++) {
			System.out.print(i+1 + ": ");
			for(int j=0; j<input; j++) {
				if(i != j) {
					System.out.print(size(num[i], num[j]) + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
	
	public static char size(int num1, int num2) {
		if(num1 > num2) return '>';
		else if(num1 == num2) return '=';
		else return '<';
	}

}