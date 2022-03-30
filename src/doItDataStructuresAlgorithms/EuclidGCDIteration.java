package doItDataStructuresAlgorithms;

import java.util.Scanner;

public class EuclidGCDIteration {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int t;
		
		while (true) {
			if (y == 0) {
				System.out.println(x);
				break;
			}
			else {
				t = y;
				y = x % y;
				x = t;
			}
		}
		
		stdIn.close();
	}

}
