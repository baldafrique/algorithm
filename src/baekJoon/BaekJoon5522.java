package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5522 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(reader.readLine());
		}
		writer.write(Integer.toString(sum));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
