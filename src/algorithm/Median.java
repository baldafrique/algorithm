package algorithm;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		while (sc.hasNext()) {
			for(int i=0; i<3; i++) {
				num[i] = sc.nextInt();
			}
			System.out.println(findMedian(num[0], num[1], num[2]));
		}
		sc.close();
	}

	public static int findMedian(int a, int b, int c) {
		if (a >= b) { // a >= b : abc, cab, acb
			if (b >= c) {
				return b; // abc
			}
			else if (a >= c) { // a >= b, c > b, a >= c : acb
				return c;
			}
			else { // a >= b, c > b, c > a : cab
				return a;
			}
		}
		else if (a >= c) { // b > a : bac, cba, bca
			return a; // b > a, a >=c : bac
		}
		else if (b >= c) { // b > a, c > a
			return c; // bca : c
		}
		else { // b > a, c > a, c > a 
			return b; // cba
		}
	}
}
