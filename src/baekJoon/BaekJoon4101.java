package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4101 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		
		while (!input.equals("0 0")) {
			writer.write((Integer.parseInt(input.split(" ")[0]) > Integer.parseInt(input.split(" ")[1]) ? "Yes" : "No") + "\n");
			input = reader.readLine();
		}
		
		reader.close();
		writer.close();
	}

}