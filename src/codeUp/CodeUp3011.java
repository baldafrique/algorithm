package codeUp;

import java.util.Scanner;

public class CodeUp3011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		int temp;
		int count = 0;
		int check= 0;
		
		for(int i=0; i<number; i++) numbers[i] = scanner.nextInt();
		
		for(int i=0; i<number-1; i++) {
			for(int j=0; j<number-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					check = 1;
				}
			}
			if(check == 1) {
				count++;
				check = 0;
			}
			else {
				break;
			}
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}