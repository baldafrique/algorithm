package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20233 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(reader.readLine());
		int x = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int y = Integer.parseInt(reader.readLine());
		int T = Integer.parseInt(reader.readLine());
		int sumA = a;
		int sumB = b;
		
		if (T > 30) {
			sumA += (T - 30) * x * 21;
		}
		
		if (T > 45) {
			sumB += (T - 45) * y * 21;
		}
		
		writer.write(sumA + " " + sumB);
		reader.close();
		writer.close();
	}
}
