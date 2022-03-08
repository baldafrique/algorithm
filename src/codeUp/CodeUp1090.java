package codeUp;

import java.util.Scanner;

public class CodeUp1090 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = scanner.nextInt();
		int ratio = scanner.nextInt();
		int number = scanner.nextInt();
		long result = initial * (long)Math.pow(ratio, number-1);
		System.out.println(result);
		scanner.close();
	}

}