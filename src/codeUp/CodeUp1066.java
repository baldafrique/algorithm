package codeUp;

import java.util.Scanner;

public class CodeUp1066 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];
		
		for(int i=0; i<3; i++) {
			numbers[i] = scanner.nextInt();
			if(numbers[i] % 2 == 0) System.out.println("even");
			else System.out.println("odd");
		}
		scanner.close();
	}

}
