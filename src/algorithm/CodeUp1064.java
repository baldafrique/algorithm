package algorithm;

import java.util.Scanner;

public class CodeUp1064 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		
		int minimum = (number1 < number2 ? number1 : number2) < number3 ? (number1 < number2 ? number1 : number2) : number3;
		System.out.println(minimum);
	}

}
