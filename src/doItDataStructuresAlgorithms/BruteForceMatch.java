package doItDataStructuresAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForceMatch {
	static int bfMatch(String text, String pattern) {
		int textPointer = 0;
		int patternPointer = 0;
		int startPointer = 0;
		
		while (textPointer != text.length() && patternPointer != pattern.length()) {
			startPointer = textPointer;
			if (text.charAt(textPointer) == pattern.charAt(patternPointer)) {
				textPointer++;
				patternPointer++;
			}
			else {
//				textPointer = startPointer + 1;
//				startPointer = textPointer;
				textPointer = textPointer - patternPointer + 1;
				
				patternPointer = 0;
			}
		}
		
		if (patternPointer == pattern.length()) {
			return startPointer;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Text : ");
		String s1 = reader.readLine();
		
		System.out.print("Pattern : ");
		String s2 = reader.readLine();
		
		int idx = bfMatch(s1, s2);
		
		if (idx == -1) {
			System.out.println("No pattern in the text.");
		}
		else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();
			System.out.println("Match from the " + (idx + 1) + " character.");
			System.out.println("Text : " + s1);
			System.out.printf(String.format("Pattern : %%%ds\n", len), s2);
		}
		reader.close();
	}

}
