package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10990 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		int y1 = num ;
		int y2 = num;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < num * 2; j++) {
				if (j > y2) {
					continue;
				}
				else if (j == y1 || j == y2) {
					writer.write('*');
				}
				else {
					writer.write(' ');
				}
			}
			writer.write('\n');
			y1--;
			y2++;
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
