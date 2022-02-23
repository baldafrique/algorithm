package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10991 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(reader.readLine());
		int val1 = num;
		int val2 = num;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < num * 2; j++) {
				if (j > val2) {
					continue;
				}
				else if (j >= val1 && j <= val2) {
					if ((val1 % 2 == 0 && j % 2 == 0) || (val1 % 2 != 0 && j % 2 != 0)) {
						writer.write('*');
					}
					else {
						writer.write(' ');
					}
				}
				else {
					writer.write(' ');
				}
			}
			writer.write('\n');
			val1--;
			val2++;
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
