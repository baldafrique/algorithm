package codeUp;

import java.util.Scanner;

public class CodeUp1915 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	int answer = recursive(input);
	System.out.println(answer);
	scanner.close();
	}
	
	public static int recursive(int input) {
		if(input>3) {
			return recursive(input-2) + recursive(input-1);
		}
		else if(input == 3){
			return 2;
		}
		else {	
			return 1;
		}
	}

}