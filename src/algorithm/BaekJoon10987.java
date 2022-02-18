package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10987 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' 
			|| str.charAt(i) == 'e' 
			|| str.charAt(i) == 'i' 
			|| str.charAt(i) == 'o'
			|| str.charAt(i) == 'u') {
				cnt++;
			}
		}
		
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}

}
