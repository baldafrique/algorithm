package codeUp;

import java.util.Scanner;

public class CodeUp1026 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split(":");
		int minute = Integer.parseInt(array[1]);
		System.out.println(minute);
		scanner.close();
	}

}