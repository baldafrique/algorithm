package algorithm;

import java.util.Scanner;

public class CodeUp1087 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int sum = 0;
		for(int i=1; sum<input; i++) {
			sum = i * (i+1) / 2;
		}
		System.out.println(sum);
		scanner.close();
	}

}
