package doItDataStructuresAlgorithms;

import java.util.Scanner;

public class BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		
		while (pt != txt.length() && pp != pat.length()) {
			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			}
			else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		
		if (pp == pat.length()) {
			return pt - pp;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Text : ");
		String s1 = stdIn.next();
		
		System.out.print("Pattern : ");
		String s2 = stdIn.next();
		
		int idx = bfMatch(s1, s2);
		
		if (idx == -1) {
			System.out.println("No pattern in the text.");
		}
		else {
			System.out.println("Pattern starts from index " + (idx + 1) + ".");
		}
		
		stdIn.close();
	}
}
