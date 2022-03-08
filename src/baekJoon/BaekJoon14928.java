package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14928 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		
		int rest = str.charAt(0) - '0';
		for (int i = 0; i < str.length() - 1; i++) {
			rest = (rest * 10 + str.charAt(i + 1) - '0') % 20000303;
		}
		writer.write(Integer.toString(rest));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
