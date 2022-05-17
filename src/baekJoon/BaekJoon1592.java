package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon1592 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int L = Integer.parseInt(stringTokenizer.nextToken());
		int[] player = new int[N];
		int count = 0;
		int index = 0;
		
		while (true) {
			player[index]++;
			if (player[index] == M) {
				break;
			}
			else if (player[index] % 2 == 0) {
				index = (index + N - L) % N;
			}
			else {
				index = (index + L) % N;
			}
			count++;
		}
		
		writer.write(Integer.toString(count));
		writer.flush();
		reader.close();
		writer.close();
	}
}
