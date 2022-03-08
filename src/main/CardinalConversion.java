package main;

import java.util.Scanner;

public class CardinalConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int cardinal = scanner.nextInt(); // 기수
		int digits = 0;
		char[] output = new char[100];
		String unitDigit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			output[digits++] = unitDigit.charAt(input % cardinal); // cardinal로 나눈 나머지 저장
			input /= cardinal;
		} while (input != 0);
		
		for (int i=digits-1; i>=0; i--) {
			System.out.print(output[i]);
		}
		
		scanner.close();
	}
	
}