package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15727 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int dist = Integer.parseInt(reader.readLine());
		writer.write(Integer.toString(dist / 5 + (dist % 5 == 0 ? 0 : 1)));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
