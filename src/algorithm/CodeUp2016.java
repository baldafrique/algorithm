package algorithm;

import java.util.Scanner;

public class CodeUp2016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String input = scanner.next();
		String[] data = input.split("");
		
		for(int i=0; i<data.length; i++) {
			if(i+1 == data.length) {
				System.out.print(data[i]);
			}
			else if((i+1) % 3 == number % 3) {
				System.out.print(data[i] + ",");
			}
			else {
				System.out.print(data[i]);
			}
		}
		
		scanner.close();
	}

}
// (I+1) %3 == (Number % 3 )