package algorithm;

import java.util.Scanner;

public class CodeUp1095 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int minimum = scanner.nextInt();
		int[] numbers = new int[number-1];
		for(int i=0; i<number-1; i++) {
			numbers[i] = scanner.nextInt();
			if(minimum > numbers[i]) minimum = numbers[i];
		}
		System.out.println(minimum);
		
		scanner.close();
	}

}