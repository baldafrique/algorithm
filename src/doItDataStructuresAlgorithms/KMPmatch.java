package doItDataStructuresAlgorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KMPmatch {
	static int kmpMatch(String txt, String pat) {
		int pt = 1; // cursor of txt
		int pp = 0; // cursor of pat
		int[] skip = new int[pat.length() + 1];
		
		// make skip table
		skip[pt] = 0;
		while (pt != pat.length()) {
			if (pat.charAt(pt) == pat.charAt(pp)) {
				skip[++pt] = ++pp;
			}
			else if (pp == 0) {
				skip[++pt] = pp;
			}
			else {
				pp = skip[pp];
			}
		}
		
		// search
		pt = pp = 0;
		while (pt != txt.length() && pp != pat.length()) {
			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			}
			else if (pp == 0) {
				pt++;
			}
			else {
				pp = skip[pp];
			}
		}
		
		if (pp == pat.length()) {
			return pt - pp;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("Text : ");
		String s1 = reader.readLine();
		
		System.out.print("Pattern : ");
		String s2 = reader.readLine();
		
		int idx = kmpMatch(s1, s2);
		
		if (idx == -1) {
			writer.write("No pattern in the text.");
		}
		else {
			writer.write("Pattern starts from index " + idx + ".");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
