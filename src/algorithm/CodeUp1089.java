package algorithm;

import java.util.Scanner;

public class CodeUp1089 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = scanner.nextInt();
		int diffrence = scanner.nextInt();
		int number = scanner.nextInt();
		System.out.println(initial + (number-1) * diffrence);
		scanner.close();
	}

}