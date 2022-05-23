package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4880 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		int[] numbers = new int[3];
		while (!input.equals("0 0 0")) {
			for (int i = 0; i < 3; i++) {
				numbers[i] = Integer.parseInt(input.split(" ")[i]);
			}
			if (numbers[2] - numbers[1] == numbers[1] - numbers[0]) {
				writer.write("AP " + (numbers[2] + numbers[2] - numbers[1]) + "\n");
			}
			else {
				writer.write("GP " + (numbers[2] * numbers[2] / numbers[1]) + "\n");
			}
			input = reader.readLine();
		}
		
		reader.close();
		writer.close();
	}

}