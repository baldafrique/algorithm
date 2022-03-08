package codeUp;

import java.util.Scanner;

public class CodeUp1117 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		float sum = number1 * number2;
		System.out.println(String.format("%.2f", sum));
		scanner.close();
	}

}
