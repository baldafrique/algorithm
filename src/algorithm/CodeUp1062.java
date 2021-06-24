package algorithm;

import java.util.Scanner;

public class CodeUp1062 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.printf("%d", number1 > number2 ? number1 : number2);
	}

}
