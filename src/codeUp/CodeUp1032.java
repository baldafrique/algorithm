package codeUp;

import java.util.Scanner;

public class CodeUp1032 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String temp = Integer.toHexString(input);
        System.out.println(temp.toUpperCase());
        scanner.close();
	}

}
