package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon20332 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(stringTokenizer.nextToken());
		}
		
		writer.write(sum % 3 == 0 ? "yes" : "no");
		reader.close();
		writer.close();
	}
}
