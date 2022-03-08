package codeUp;

import java.util.Scanner;

public class CodeUp1451 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		int temp;
		
		for(int i=0; i<number; i++) numbers[i] = scanner.nextInt();
		
		for(int i=0; i<number-1; i++) {
			for(int j=0; j<number-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<number; i++) System.out.println(numbers[i]);
		
		scanner.close();
	}

}