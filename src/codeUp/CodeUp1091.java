package codeUp;

import java.util.Scanner;

public class CodeUp1091 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long initial = scanner.nextLong();
		long multiplication = scanner.nextLong();
		long difference = scanner.nextLong();
		long number = scanner.nextLong();
		long first = initial;
		long second = initial;
	
		for(int i=1; i<number; i++) {
			second = first * multiplication + difference;
			first = second;
		}
		
		System.out.println(second);
		
		scanner.close();
	}

}