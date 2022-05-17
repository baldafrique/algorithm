package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon15719 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Long.parseLong(reader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		long sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(stringTokenizer.nextToken());
		}
		
		sum -= (N - 1) * N / 2;
		writer.write(Long.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}
}
