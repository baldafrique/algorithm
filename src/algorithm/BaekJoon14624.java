package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14624 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		if (num % 2 != 0) {
			for (int i = 0; i < num; i++) {
				writer.write("*");
			}
			writer.write("\n");
			
			int idx1 = (num + 1) / 2;
			int idx2 = idx1;
			for (int i = 1; i <= (num + 1) / 2; i++) {
				for (int j = 1; j <= num; j++) {
					if (j == idx1 || j == idx2) {
						writer.write("*");
					}
					else if (j > idx2) {
						continue;
					}
					else {
						writer.write(" ");
					}
				}
				idx1--;
				idx2++;
				writer.write("\n");
			}
		}
		else {
			writer.write("I LOVE CBNU\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
