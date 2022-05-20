package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3449 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		for (int i = 0; i < T; i++) {
			String A = reader.readLine();
			String B = reader.readLine();
			int distance = 0;
			
			for (int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(j)) {
					distance++;
				}
			}
			writer.write("Hamming distance is " + distance + ".\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}