package codeUp;

import java.util.Scanner;

public class CodeUp1027 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split("\\.");
		System.out.println(array[2] + "-" + array[1] + "-" + array[0]);
		scanner.close();
	}

}