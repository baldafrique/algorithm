package algorithm;

import java.util.Scanner;

public class CodeUp1078 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int sum = 0;
		for(int i=1; i<=input; i++) {
			if(i % 2 == 0) sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
