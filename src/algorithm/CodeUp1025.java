package algorithm;

import java.util.Scanner;

public class CodeUp1025 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] array = input.split("");
		int decline = 1;
		int[] numbers = new int[5];
		for(int i=0; i<array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]) * 10000;
		}
		for(int i=0; i<array.length; i++) {
			System.out.println("[" + numbers[i]/decline + "]");
			decline *= 10;
		}
	}

}