package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15051 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int A1 = Integer.parseInt(reader.readLine());
		int A2 = Integer.parseInt(reader.readLine());
		int A3 = Integer.parseInt(reader.readLine());
		
		int B1 = 2 * A2 + 4 * A3;
		int B2 = 2 * (A1 + A3);
		int B3 = 4 * A1 + 2 *A2;
		
		writer.write(Integer.toString(Math.min(B1, Math.min(B2, B3))));
		reader.close();
		writer.close();
	}

}