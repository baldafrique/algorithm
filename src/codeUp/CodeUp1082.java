package codeUp;

import java.util.Scanner;

public class CodeUp1082 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int hex = Integer.parseInt(input, 16);
		for(int i=1; i<16; i++) {
			System.out.printf("%X*%X=%X\n", hex, i, hex * i);
		}
		scanner.close();
	}

}
