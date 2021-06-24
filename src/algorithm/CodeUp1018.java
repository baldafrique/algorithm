package algorithm;

import java.util.Scanner;

public class CodeUp1018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split("//.");
		int year = Integer.valueOf(array[0]);
		int month = Integer.valueOf(array[1]);
		int day = Integer.valueOf(array[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}