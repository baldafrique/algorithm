package codeUp;

import java.util.Scanner;

public class CodeUp1093 {

	public final static int STUDENT_NUMBER = 23;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] students = new int[STUDENT_NUMBER];
		int number = scanner.nextInt();
		int call;
		for(int i=0; i<number; i++) {
			call = scanner.nextInt();
			students[call-1]++;
		}
		
		for(int i=0; i<STUDENT_NUMBER; i++) {
			System.out.print(students[i] + " ");
		}
		
		scanner.close();
	}

}