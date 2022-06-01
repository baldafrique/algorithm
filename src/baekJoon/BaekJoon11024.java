package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon11024 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		int sum;
		StringTokenizer stringTokenizer;
		
		for (int i = 0; i < T; i++) {
			sum = 0;
			stringTokenizer = new StringTokenizer(reader.readLine());
			while (stringTokenizer.hasMoreTokens()) {
				sum += Integer.parseInt(stringTokenizer.nextToken());
			}
			writer.write(Integer.toString(sum) + "\n");
		}
		
		
		reader.close();
		writer.close();
	}

}