package algorithm;

import java.util.Scanner;

public class CodeUp1041 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char data = input.charAt(0);
		int number = (int)data+1;
		data = (char)number;
		System.out.println(data);
	}

}
