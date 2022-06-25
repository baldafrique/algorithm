import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());
		int[] scores = new int[N];
		int index = N - k;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(scores);
		writer.write(Integer.toString(scores[index]));
		writer.flush();
		reader.close();
		writer.close();
	}

}
