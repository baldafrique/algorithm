package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5789 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			String num = reader.readLine();
			writer.write((num.charAt(num.length() / 2 - 1) == num.charAt(num.length() / 2) ? "Do-it" : "Do-it-Not") + "\n"); 
		}
		reader.close();
		writer.close();
	}

}