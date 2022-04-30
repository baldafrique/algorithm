package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20112 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		String[] input = new String[N];
		String row = "";
		String column = "";
		
		for (int i = 0; i < N; i++) {
			input[i] = reader.readLine();
			row += input[i];
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				column += input[j].charAt(i);
			}
		}
		
		writer.write(row.equals(column) ? "YES" : "NO");
		writer.flush();
		reader.close();
		writer.close();
	}
}
