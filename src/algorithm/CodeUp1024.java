package algorithm;

import java.util.Scanner;

public class CodeUp1024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split("");
		for(int i=0; i<array.length; i++) {
			System.out.println("\'" + array[i] + "\'");
		}
	}

}