package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4504 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		int input = Integer.parseInt(reader.readLine());
		
		while (input != 0) {
			writer.write(input + " is " + (input % n == 0 ? "" : "NOT ") + "a multiple of " + n + "\n");
			input = Integer.parseInt(reader.readLine());
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
