package doItDataStructuresAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfTester {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Text : ");
		String s1 = bufferedReader.readLine();
		
		System.out.print("Pattern : ");
		String s2 = bufferedReader.readLine();
		
		int idx1 = s1.indexOf(s2);
		int idx2 = s1.lastIndexOf(s2);
		
		if (idx1 == -1) {
			System.out.println("No pattern in the text.");
		}
		else {
			int len1 = 0;
			for (int i = 0; i < idx1; i++) {
				len1 += s1.substring(i, i + 1).getBytes().length;
			}
			len1 += s2.length();
			
			int len2 = 0;
			for (int i = 0; i < idx2; i++) {
				len2 += s1.substring(i, i + 1).getBytes().length;
			}
			len2 += s2.length();
			
			System.out.println("Text : " + s1);
			System.out.printf(String.format("Pattern : %%%ds\n", len1), s2);
			System.out.println("Text : " + s1);
			System.out.printf(String.format("Pattern : %%%ds\n", len2), s2);
		}
		
		bufferedReader.close();
	}

}
