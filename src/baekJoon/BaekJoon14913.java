package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BaekJoon14913 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// an == a1 + (n - 1) * d
		// n == (k - a1) / d + 1
		
		String str = reader.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int d = Integer.parseInt(str.split(" ")[1]);
		int k = Integer.parseInt(str.split(" ")[2]);
		
		if ((d > 0 && a > k) || (d < 0 && a < k)) {
			writer.write('X');
		}
		else { 
			int n = (k - a) / d + 1;
			if (a + (n - 1) * d == k) {
				writer.write(Integer.toString(n));
			}
			else {
				writer.write('X');
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
	
}