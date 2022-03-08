package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11966 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i <= 30; i++) {
			if (Math.pow(2, i) == n) {
				writer.write('1');
				writer.flush();
				return;
			}
		}
		writer.write('0');
		writer.flush();
		
		reader.close();
		writer.close();
	}

}
