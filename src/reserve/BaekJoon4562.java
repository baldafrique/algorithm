package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4562 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String input = reader.readLine();
			int X = Integer.parseInt(input.split(" ")[0]);
			int Y = Integer.parseInt(input.split(" ")[1]);
			writer.write((X >= Y ? "MMM BRAINS" : "NO BRAINS") + "\n");
		}
		
		reader.close();
		writer.close();
	}

}