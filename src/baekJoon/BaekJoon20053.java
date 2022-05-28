package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon20053 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(reader.readLine());
			int[] numbers = new int[N];
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			for (int j = 0; j < N; j++) {
				numbers[j] = Integer.parseInt(stringTokenizer.nextToken());
			}
			Arrays.sort(numbers);
			writer.write(numbers[0] + " " + numbers[N - 1] + "\n");
		}
		
		
		reader.close();
		writer.close();
	}

}