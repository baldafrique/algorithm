package algorithm;

import java.util.Scanner;

public class CodeUp1904 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int start = scanner.nextInt();
	int end = scanner.nextInt();
	
	recursive(start, end);
	scanner.close();
	}
	
	public static void recursive(int start, int end) {
		if(start > end) return;
		else {
			if(start % 2 != 0) System.out.print(start + " ");
			recursive(start+1, end);
		}
	}

}