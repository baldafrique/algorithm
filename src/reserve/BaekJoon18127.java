package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon18127 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		
		int value = A - 2;
		int sum = 1;
		int operand = 1;
		
		for (int i = 0; i < B; i++) {
			operand += value;
			sum += operand;
		}
		
		writer.write(Integer.toString(sum));
		reader.close();
		writer.close();
	}
}
