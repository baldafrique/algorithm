package codeUp;

import java.util.Scanner;

public class CodeUp1034 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int octal = Integer.parseInt(input, 8);
        System.out.println(octal);
        scanner.close();   
	}

}
