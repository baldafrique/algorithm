package algorithm;

import java.util.Scanner;

public class CodeUp1046 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number1 = scanner.nextLong();
		long number2 = scanner.nextLong();
		long number3 = scanner.nextLong();
		long sum = number1 + number2 + number3;
		double average = sum/3.0;
		
		System.out.println(sum);
		System.out.printf("%.1f", average);
	}

}
