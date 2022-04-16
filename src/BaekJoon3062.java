import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3062 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			String original = reader.readLine();
			String reversed = "";
			
			for (int j = original.length() - 1; j >= 0; j--) {
				reversed += Character.toString(original.charAt(j));
			}
			
			String result = Integer.toString(Integer.parseInt(original) + Integer.parseInt(reversed));
			boolean flag = true;
			
			for (int j = 0; j < result.length() / 2; j++) {
				if (result.charAt(j) != result.charAt((result.length() - 1) - j)) {
					flag = false;
					break;
				}
			}
			
			writer.write((flag ? "YES" : "NO") + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
