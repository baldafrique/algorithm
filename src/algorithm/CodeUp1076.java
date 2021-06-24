package algorithm;

import java.util.Scanner;

public class CodeUp1076 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char first = input.charAt(0);
		int number = (int)first;
		int count = 97;
		do {
			System.out.print((char)count++ + " ");
		}while(count<=number);
		
	}

}
