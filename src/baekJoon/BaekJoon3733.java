package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3733 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		
		while (input != null) {
			int N = Integer.parseInt(input.split(" ")[0]);
			int S = Integer.parseInt(input.split(" ")[1]);
			int x = S / (N + 1);
			writer.write(x + "\n");
			input = reader.readLine();
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
