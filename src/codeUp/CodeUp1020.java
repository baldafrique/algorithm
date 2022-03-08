package codeUp;

import java.util.Scanner;

public class CodeUp1020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split("-");
		System.out.println(array[0]+array[1]);
		scanner.close();
	}

}