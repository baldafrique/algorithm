package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11091 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String alphabet;
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < n; i++) {
			alphabet = "abcdefghijklmnopqrstuvwxyz";
			String input = reader.readLine().replaceAll(" ", "").toLowerCase();
			for (int j = 0; j < input.length(); j++) {
				alphabet = alphabet.replace(input.charAt(j), '0');
			}
			if (alphabet.equals("00000000000000000000000000")) {
				writer.write("pangram");
			}
			else {
				writer.write("missing ");
				for (int j = 0; j < alphabet.length(); j++) {
					if (alphabet.charAt(j) != '0') {
						writer.write(alphabet.charAt(j));
					}
				}
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
