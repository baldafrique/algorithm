package codeUp;

import java.util.Scanner;

public class CodeUp1067 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input > 0) System.out.println("plus");
		else System.out.println("minus");
		if(input % 2 == 0) System.out.println("even");
		else System.out.println("odd");
		scanner.close();
	}

}
