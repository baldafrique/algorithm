import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon20113 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		int[] ballotBox = new int[N];
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			int index = Integer.parseInt(stringTokenizer.nextToken());
			if (index != 0) {
				ballotBox[--index]++; 
			}
		}

		int max = Arrays.stream(ballotBox).max().getAsInt();
		int maxCount = 0;
		boolean flag = true;
		
		for (int i = 0; i < N; i++) {
			if (maxCount == 2) {
				writer.write("skipped");
				flag = false;
				break;
			}
			else if (ballotBox[i] == max) {
				maxCount++;
			}
		}
		
		if (flag) {
			for (int i = 0; i < N; i++) {
				if (ballotBox[i] == max) {
					writer.write(Integer.toString(i + 1));
					break;
				}
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
