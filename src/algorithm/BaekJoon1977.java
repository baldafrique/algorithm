package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1977 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		int sum = 0;
		int min = 0;
		
		for (int i = (int) Math.sqrt(m); i <= Math.sqrt(n); i++) {
			if (Math.pow(i, 2) >= m && Math.pow(i, 2) <= n) {
				if (sum == 0) {
					min = (int) Math.pow(i, 2);
				}
				sum += Math.pow(i, 2);
			}
		}
		
		writer.write(sum == 0 ? "-1" : sum + "\n" + min);
		writer.flush();
		reader.close();
		writer.close();
	}

}
