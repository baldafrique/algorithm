package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20833 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		long sum = 0;
		
		for (int i = 1; i <= N; i++) {
			sum += Math.pow(i, 3);
		}
		
		writer.write(Long.toString(sum));
		reader.close();
		writer.close();
	}

}