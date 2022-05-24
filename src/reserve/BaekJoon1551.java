package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1551 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		String wildProgression = reader.readLine();
		int[] progression = new int[N];
		int[] nextProgression = new int[N - 1];
		
		for (int i = 0; i < N; i++) {
			progression[i] = Integer.parseInt(wildProgression.split(",")[i]);
		}
		
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < N - 1; j++) {
				nextProgression[j] = progression[j + 1] - progression[j];
			}
			N--;
			progression = Arrays.copyOf(nextProgression, N);
		}
		
		for (int i = 0; i < N; i++) {
			writer.write(Integer.toString(progression[i]));
			if (i < N - 1) {
				writer.write(",");
			}
		}
		
		reader.close();
		writer.close();
	}

}