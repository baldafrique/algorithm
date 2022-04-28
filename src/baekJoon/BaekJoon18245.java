package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18245 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String code = reader.readLine();
		int i = 1;
		
		while (!code.equals("Was it a cat I saw?")) {
			for (int j = 0; j < code.length(); j++) {
				writer.write(code.charAt(j));
				j += i;
			}
			writer.write("\n");
			i++;
			code = reader.readLine();
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
