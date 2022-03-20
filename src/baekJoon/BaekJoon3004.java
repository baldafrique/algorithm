package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3004 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		int n = Integer.parseInt(reader.readLine());
 		int m = n / 2;
 		
 		if (n % 2 == 0) {
 			writer.write(Integer.toString((int)Math.pow(++m, 2)));
 		}
 		else {
 			writer.write(Integer.toString((m + 2) * (m + 1)));
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
