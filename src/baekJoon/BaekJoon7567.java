package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon7567 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String status = reader.readLine();
		int height = 10;
		
		for (int i = 0; i < status.length() - 1; i++) {
			if (status.charAt(i) == status.charAt(i + 1)) {
				height += 5;
			}
			else {
				height += 10;
			}
		}
		
		writer.write(Integer.toString(height));
		writer.flush();
		reader.close();
		writer.close();
	}

}
