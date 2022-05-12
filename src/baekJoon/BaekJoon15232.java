package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15232 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int R = Integer.parseInt(reader.readLine());
		int C = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				writer.write('*');
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
