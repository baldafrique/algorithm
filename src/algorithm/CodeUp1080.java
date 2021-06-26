package algorithm;

import java.util.Scanner;

public class CodeUp1080 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int answer = 0;
		int sum = 0;
		for(int i=1; sum < input; i++) {
			sum = i*(i+1)/2;
			answer = i;
		}
		System.out.println(answer);
		scanner.close();
	}

}
