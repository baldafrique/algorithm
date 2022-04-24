package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2355 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		long A = Integer.parseInt(stringTokenizer.nextToken());
		long B = Integer.parseInt(stringTokenizer.nextToken());
		long left = A < B ? A : B;
		long right = A < B ? B : A;
		long n;
		
		if (A * B > 0) {
			n = Math.abs(left - right) + 1;
		}
		else {
			n = right - left + 1;
		}
		long sum = n * (left + right) / 2;
		writer.write(Long.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}
}
