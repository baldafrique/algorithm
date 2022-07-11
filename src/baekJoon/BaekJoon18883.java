package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon18883 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		for (int i = 1; i <= N * M; i++) {
			if (i % M != 0) {
				writer.write(i + " ");				
			}
			else {
				writer.write(i + "\n");
			}
		}
		
		reader.close();
		writer.close();
	}

}