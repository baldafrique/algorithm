package codeUp;

import java.util.Scanner;

public class CodeUp1086 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long width = scanner.nextInt();
		long height = scanner.nextInt();
		long bit = scanner.nextInt();
		long sum = width * height * bit;
		double megabyte = sum / (8 * 1024 * 1024 * 1.0);
		System.out.printf("%.2f MB", megabyte);
		scanner.close();
	}

}
