package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon25177 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		
		int size = N > M ? N : M;
		int[] scores = new int[size];
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			scores[i] -= Integer.parseInt(stringTokenizer.nextToken());
		}
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < M; i++) {
			scores[i] += Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(scores);
		int max = scores[size - 1];
		
		writer.write(Integer.toString(max > 0 ? max : 0));
		reader.close();
		writer.close();
	}
}