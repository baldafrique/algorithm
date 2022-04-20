package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon15969 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int N = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		int[] scores = new int[N];
		
		for (int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		Arrays.sort(scores);
		writer.write(Integer.toString(scores[N - 1] - scores[0]));
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
