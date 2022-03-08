package codeUp;

import java.util.Scanner;

public class CodeUp1081 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=input2; j++) {
				System.out.println(i + " " + j);
			}
		}
		scanner.close();
	}

}
