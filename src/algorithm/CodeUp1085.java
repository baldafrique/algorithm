package algorithm;

import java.util.Scanner;

public class CodeUp1085 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long hertz = scanner.nextInt();
		long bit = scanner.nextInt();
		long channel = scanner.nextInt();
		long second = scanner.nextInt();
		long sum = hertz * bit * channel * second;
		double megabyte = sum / (8 * 1024 * 1024 * 1.0);
		System.out.printf("%.1f MB", megabyte);
		scanner.close();
	}

}
