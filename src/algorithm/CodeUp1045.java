package algorithm;

import java.util.Scanner;

public class CodeUp1045 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		float value = (float)number1 / number2;
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
		System.out.printf("%.2f", value);
		scanner.close();
	}

}
