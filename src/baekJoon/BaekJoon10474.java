package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10474 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		while (!input.equals("0 0")) {
			int numerator = Integer.parseInt(input.split(" ")[0]);
			int denominator = Integer.parseInt(input.split(" ")[1]);
			
			writer.write(numerator / denominator + " ");
			writer.write(numerator % denominator + " / ");
			writer.write(denominator + "\n");
			
			input = reader.readLine();
		}
		
		
		reader.close();
		writer.close();
	}

}