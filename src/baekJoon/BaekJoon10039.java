package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10039 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int score;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			score = Integer.parseInt(reader.readLine());
			sum += score < 40 ? 40 : score;
		}
		
		writer.write(Integer.toString(sum / 5));
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
