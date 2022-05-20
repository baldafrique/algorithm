package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5524 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			String string = reader.readLine();
			writer.write(string.toLowerCase() + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}