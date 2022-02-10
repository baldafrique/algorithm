package algorithm;

import java.util.Scanner;

public class CodeUp1092 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] days = new int[3];
		int day = 1;
		for(int i=0; i<3; i++) days[i] = scanner.nextInt();
		while(day % days[0] != 0 || day % days[1] != 0 || day % days[2] != 0) day++;
		System.out.println(day);
		scanner.close();
	}

}