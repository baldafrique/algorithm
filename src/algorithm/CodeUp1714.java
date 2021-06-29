package algorithm;

import java.util.Scanner;

public class CodeUp1714 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] data = input.split("");
		for(int i=data.length-1; i>=0; i--) System.out.print(data[i]);
		scanner.close();
	}

}