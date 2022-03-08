package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9093 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		String[] str;
		
		for (int i = 0; i < num; i++) {
			str = reader.readLine().split(" ");
			for (int j = 0; j < str.length; j++) {
				for (int k = str[j].length() - 1; k >= 0; k--) {
					writer.write(str[j].charAt(k));
				}
				writer.write(" ");
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
