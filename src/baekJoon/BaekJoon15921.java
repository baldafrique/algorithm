package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon15921 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		if (N == 0) {
			System.out.println("divide by zero");
			return;
		}
		int[] records = new int[N];
		double mean = 0;
		double count = 1;
		double EX = 0;
		double probability;
		
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			records[i] = Integer.parseInt(stringTokenizer.nextToken());
			mean += records[i];
		}
		mean /= N;
		Arrays.sort(records);
		
		
		for (int i = 0; i < N; i++) {
			if (i < N - 1 && records[i] == records[i + 1]) {
				count++;
			}
			else {
				EX += records[i] * (count / N);
				count = 1;
			}
		}
		
		if (EX == 0) {
			System.out.println("divide by zero");
			return;
		}
		
		probability = mean / EX;
		System.out.printf("%.2f", probability);
		reader.close();
		writer.close();
	}
}
