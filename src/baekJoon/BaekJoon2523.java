package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2523 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i < 2 * num; i++) {
			if (i < num) {
				for (int j = 1; j <= i; j++) {
					writer.write('*');
				}
			}
			else if (i == num) {
				for (int j = 1; j <= num; j++) {
					writer.write('*');
				}
			}
			else {
				for (int j = i; j < 2 * num; j++) {
					writer.write('*');
				}
			}
			
			writer.write('\n');
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
