package codeUp;

import java.util.Scanner;

public class CodeUp1901 {
	
	static int number = 1;

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	recursive(input);
	scanner.close();
	}
	
	public static void recursive(int input) {
		if(number <= input) {
			System.out.println(number);
			number++;
			recursive(input);
		}
	}

}