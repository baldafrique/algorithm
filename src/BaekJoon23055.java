import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon23055 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
					writer.write("*");
				}
				else if (i == j) {
					writer.write("*");	
				}
				else if (i + j == N - 1) { 
					writer.write("*");	
				}
				else {
					writer.write(" ");
				}
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
