package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15813 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(reader.readLine());
		String name = reader.readLine();
		int score = 0;
		
		for (int i = 0; i < length; i++) {
			score += name.charAt(i) - 'A' + 1;
		}

		writer.write(Integer.toString(score));
		writer.flush();
		reader.close();
		writer.close();
	}
}
