package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			String str = reader.readLine();
			writer.write(str.substring(0, 1) + str.substring(str.length() - 1) + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
