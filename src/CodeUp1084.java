package algorithm;

import java.util.Scanner;

public class CodeUp1084 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int red = scanner.nextInt();
		int green = scanner.nextInt();
		int blue = scanner.nextInt();
		int count = 0;
		
		for(int i=0; i<red; i++) {
			for(int j=0; j<green; j++) {
				for(int k=0; k<blue; k++) {
					System.out.println(i + " " + j + " " + k);
					count++;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
