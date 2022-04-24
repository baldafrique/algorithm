package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10539 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int[] ret = new int[N];
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			ret[i] = Integer.parseInt(stringTokenizer.nextToken()) * (i + 1) - sum;
			sum += ret[i];
		}
		
		for (int i : ret) {
			writer.write(i + " ");
		}
		writer.flush();
		reader.close();
		writer.close();
	}
}
