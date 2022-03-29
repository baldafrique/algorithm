package doItDataStructuresAlgorithms;

import java.util.Scanner;

public class Factorial {
	
	// 양의 정수 n의 팩토리얼 반환
	private static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "! = " + factorial(x));
		stdIn.close();
	}

}
