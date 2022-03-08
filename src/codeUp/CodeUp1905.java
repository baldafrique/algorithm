package codeUp;

import java.util.Scanner;

public class CodeUp1905 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	int input = scanner.nextInt();
	int answer = recursive(input, sum);
	System.out.println(answer);
	scanner.close();
	}
	
	public static int recursive(int input, int sum) {
		if(input == 0) {
			return sum;
		}
		else {
			sum += input;
			return recursive(input-1, sum);
		}
	}

}