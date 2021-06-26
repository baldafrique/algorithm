package algorithm;

import java.util.Scanner;

public class CodeUp1070 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
		case 12 :
		case 1 :
		case 2 : 
			System.out.println("winter");
			break;
		case 3 :
		case 4 :
		case 5 : 
			System.out.println("spring");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("summer");
			break;
		default :
			System.out.println("fall");
		}
		scanner.close();
	}

}
