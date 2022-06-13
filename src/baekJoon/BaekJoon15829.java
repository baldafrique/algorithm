package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15829 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(reader.readLine());
		String string = reader.readLine();
		int M = 1234567891;
		long r = 1;
		long hashValue = 0;
		
		for (int i = 0; i < L; i++) {
			hashValue += (string.charAt(i) - 96) * r % M;
			r = r * 31 % M;
		}

		writer.write(Long.toString(hashValue % M));
		writer.flush();
		reader.close();
		writer.close();
	}

}