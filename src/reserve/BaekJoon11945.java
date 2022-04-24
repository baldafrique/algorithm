package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11945 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
//		int M = Integer.parseInt(str.split(" ")[1]);
		
		for (int i = 0; i < N; i++) {
			str = reader.readLine();
			for (int j = str.length() - 1; j >= 0; j--) {
				writer.write(str.charAt(j));
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
