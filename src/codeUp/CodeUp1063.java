package codeUp;

import java.util.Scanner;

public class CodeUp1063 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println(number1 ^ number2);
		scanner.close();
	}

}