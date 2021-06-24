package algorithm;

import java.util.Scanner;

public class CodeUp1051 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		if(number1 <= number2) System.out.println("1");
		else System.out.println("0");
	}

}
