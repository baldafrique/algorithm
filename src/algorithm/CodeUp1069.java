package algorithm;

import java.util.Scanner;

public class CodeUp1069 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char data = input.charAt(0);
		switch(data) {
		case 'A' : 
			System.out.println("best!!!");
			break;
		case 'B' :
			System.out.println("good!!");
			break;
		case 'C' :
			System.out.println("run!");
			break;
		case 'D' :
			System.out.println("slowly~");
			break;
		default :
			System.out.println("what?");
		}
		scanner.close();
	}

}
