package doItDataStructuresAlgorithms;

import java.util.Scanner;

public class FactorialIteration {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int result = 1;
		int num = stdIn.nextInt();
		
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		
		System.out.println(result);
		stdIn.close();
	}

}
