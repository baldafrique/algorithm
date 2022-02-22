package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2445 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= num * 2; i++) {
			for (int j = 1; j <= num * 2; j++) {
				if (i < num) {
					if (j <= i || j > num * 2 - i) {
						writer.write('*');
					}
					else {
						writer.write(' ');
					}
				}
				else if (i == num) {
					writer.write('*');
				}
				else {
					if (j <= num * 2 - i || j > i) {
						writer.write('*');
					}
					else {
						writer.write(' ');
					}
				}
				
			}
			writer.write('\n');
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
