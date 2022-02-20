package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10798 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		String[] str = new String[5];
		
		for (int i = 0; i < 5; i++) {
			str[i] = reader.readLine();
			if (max < str[i].length()) {
				max = str[i].length();
			}
		}
		
		String result = "";
		
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (str[j].length() > i) {
					result += str[j].charAt(i);
				}
			}
		}

		writer.write(result);
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
