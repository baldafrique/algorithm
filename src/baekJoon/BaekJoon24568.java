package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24568 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int r = Integer.parseInt(reader.readLine());
		int s = Integer.parseInt(reader.readLine());
		
		writer.write(Integer.toString(r * 8 + s * 3 - 28));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
