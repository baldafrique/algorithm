package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon23809 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			for (int j = 0; j < 3 * N; j++) {
				writer.write(" ");
			}
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			writer.write("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			for (int j = 0; j < 2 * N; j++) {
				writer.write(" ");
			}
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			writer.write("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3 * N; j++) {
				writer.write("@");
			}
			writer.write("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			for (int j = 0; j < 2 * N; j++) {
				writer.write(" ");
			}
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			writer.write("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			for (int j = 0; j < 3 * N; j++) {
				writer.write(" ");
			}
			for (int j = 0; j < N; j++) {
				writer.write("@");
			}
			writer.write("\n");
		}
		
		reader.close();
		writer.close();
	}
}
