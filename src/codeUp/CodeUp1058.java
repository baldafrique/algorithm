package codeUp;

import java.util.Scanner;

public class CodeUp1058 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int result = (input1 | input2);
		if (result == 1) System.out.println("0");
		else System.out.println("1");
		scanner.close();
	}

}
