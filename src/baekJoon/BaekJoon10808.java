package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int[] cnt = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 'a']++;
		}
		
		for (int i : cnt) {
			writer.write(i + " ");
		}
				
		writer.flush();
		reader.close();
		writer.close();
	}

}
