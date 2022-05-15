package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());
		int[] coin = new int[n];
		int[] memo = new int[k + 1];
		
		memo[0] = 1;
		
		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(reader.readLine());
			for (int j = coin[i]; j <= k; j++) {
				memo[j] += memo[j - coin[i]];
			}
		}
		
		writer.write(Integer.toString(memo[k]));
		reader.close();
		writer.close();

	}

}
