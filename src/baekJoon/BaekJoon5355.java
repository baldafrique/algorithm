package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5355 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(reader.readLine());
		for (int i = 0; i < T; i++) {
			String[] str = reader.readLine().split(" ");
			float num = Float.parseFloat(str[0]);
			for (int j = 1; j < str.length; j++) {
				switch(str[j]) {
				case "@":
					num *= 3;
					break;
				case "%":
					num += 5;
					break;
				case "#":
					num -= 7;
					break;
				}
			}
			writer.write(String.format("%.2f\n", num));
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
