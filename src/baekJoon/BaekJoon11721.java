package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = reader.readLine();
		for (int i = 0; i <= word.length(); i += 10) {
			if (i + 10 > word.length()) {
				writer.write(word.substring(i, word.length()) + "\n");
			}
			else {
				writer.write(word.substring(i, i + 10) + "\n");
			}
			
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
