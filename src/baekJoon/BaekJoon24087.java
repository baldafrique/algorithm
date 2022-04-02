package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24087 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int S = Integer.parseInt(reader.readLine()); // target height
		int A = Integer.parseInt(reader.readLine()); // default height
		int B = Integer.parseInt(reader.readLine()); // increase amount
		
		if (S > A) {
			writer.write(Integer.toString(250 + (int) Math.ceil((S - A) / (float) B) * 100));
		}
		else {
			writer.write(Integer.toString(250));
		}
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
