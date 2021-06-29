package algorithm;

import java.util.Scanner;

public class CodeUp1420 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String[] names = new String[number];
		int[] grades = new int[number];
		int grade;
		String name;
		
		for(int i=0; i<number; i++) {
			names[i] = scanner.next();
			grades[i] = scanner.nextInt();
		}
		
		for(int i=0; i<number-1; i++) {
			for(int j=0; j<number-1; j++) { 
				if(grades[j] < grades[j+1]) {
					grade = grades[j];
					grades[j] = grades[j+1];
					grades[j+1] = grade;
					name = names[j];
					names[j] = names[j+1];
					names[j+1] = name;
				}
			}
		}
		
		System.out.println(names[2]);
		
		scanner.close();
	}

}