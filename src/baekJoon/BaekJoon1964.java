package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1964 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Integer.parseInt(reader.readLine());
		long ret = 5;
		
		if (N != 0) {
			ret = 5 * N + (3 * N - 2) * (N - 1) / 2;
		}
		
		ret %= 45678;
		
		writer.write(Long.toString(ret));
		writer.flush();
		reader.close();
		writer.close();
	}
}
