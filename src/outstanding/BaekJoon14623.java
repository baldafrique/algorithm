package outstanding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14623 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int B1 = Integer.parseInt(reader.readLine(), 2);
		int B2 = Integer.parseInt(reader.readLine(), 2);
		writer.write(Integer.toBinaryString(B1 * B2));
		reader.close();
		writer.close();
	}
}
