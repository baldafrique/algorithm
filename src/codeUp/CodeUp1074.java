package codeUp;

import java.util.Scanner;

public class CodeUp1074 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		while(input>0) {
			System.out.println(input--);
		}
		scanner.close();
	}

}
