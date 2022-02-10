package algorithm;

import java.util.Scanner;

public class CodeUp1902 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	recursive(input);
	scanner.close();
	}
	
	public static void recursive(int input) {
		if(input == 0) return;
		else {
			System.out.println(input);
			recursive(input-1);
		}
	}

}