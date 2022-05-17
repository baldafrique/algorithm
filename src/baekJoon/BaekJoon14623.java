package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14623 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long D1 = Long.parseLong(reader.readLine(), 2);
		long D2 = Long.parseLong(reader.readLine(), 2);
		writer.write(Long.toBinaryString(D1 * D2));
		reader.close();
		writer.close();
	}
}
