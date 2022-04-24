package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17838 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			String str = reader.readLine();
			if (str.length() == 7) {
				str = str.replaceAll(str.substring(0, 1), "A");
				str = str.replaceAll(str.substring(2, 3), "B");
				writer.write((str.equals("AABBABB") ? "1" : "0") + "\n");
			}
			else {
				writer.write("0\n");
			}
		}

		writer.flush();
		reader.close();
		writer.close();
	}
}
