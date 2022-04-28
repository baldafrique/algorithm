package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16462 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			String input = reader.readLine();
			if (input.length() != 3) {
				input = input.replace("0", "9");
				input = input.replace("6", "9");
			}
			int score = Integer.parseInt(input);
			sum += score;
		}
		writer.write(Integer.toString((int) Math.round(sum / n)));
		writer.flush();
		reader.close();
		writer.close();
	}
}
