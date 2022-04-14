package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon12605 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			String[] str = reader.readLine().split(" ");
			writer.write("Case #" + (i + 1) + ": ");
			for (int j = str.length - 1; j >= 0; j--) {
				writer.write(str[j] + " ");
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
