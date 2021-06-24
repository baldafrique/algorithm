package algorithm;

import java.util.Scanner;

public class CodeUp1084 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=1; i<=input; i++) {
			if(i%3 != 0) System.out.print(i +" ");
			else System.out.print("X ");
		}
	}

}
