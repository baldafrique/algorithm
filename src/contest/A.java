package contest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		int order = -1;
		
		if (K > 3) {
			order = (M + (K - 3)) % N;
		}
		else if (K < 3) {
			while (M - (3 - K) < 0) {
				M += N;
			}
			order = M - (3 - K);
		}
		
		writer.write(Integer.toString(order == -1 ? M : order == 0 ? N : order));
		reader.close();
		writer.close();
	}
}