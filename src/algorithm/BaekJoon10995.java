package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10995 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num * 2; j++) {
				writer.write((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0) ? '*' : ' ');
			}
			writer.write('\n');
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
