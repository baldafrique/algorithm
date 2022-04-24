package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon15780 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		int cnt = 0;
		boolean usable = false;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(stringTokenizer.nextToken());
			if (num % 2 != 0) {
				num++;
			}
			cnt += num / 2;
			if (N <= cnt) {
				usable = true;
			}
		}
		
		writer.write(usable ? "YES" : "NO");
		writer.flush();
		reader.close();
		writer.close();
	}
}
