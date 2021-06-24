package algorithm;

import java.util.Scanner;

public class CodeUp1091 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = scanner.nextInt();
		int multiplication = scanner.nextInt();
		int difference = scanner.nextInt();
		int number = scanner.nextInt();
		int answer = 0;
		
		for(int i=0; i<number; i++) {
			initial = initial * multiplication + difference;
		}
		
		System.out.println(initial);
	}

}