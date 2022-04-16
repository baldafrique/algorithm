package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1817 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int box = 0;
		
		if (N != 0) {
			str = reader.readLine();
			int[] weights = new int[N];
			int weight = 0;
			box++;
			
			for (int i = 0; i < N; i++) {
				weights[i] = Integer.parseInt(str.split(" ")[i]);
			}
			
			for (int i = 0; i < N; i++) {
				if (weight + weights[i] <= M) {
					weight += weights[i];
				}
				else {
					box++;
					weight = weights[i];
				}
			}
		}
		
		writer.write(Integer.toString(box));
		writer.flush();
		reader.close();
		writer.close();
	}
}
