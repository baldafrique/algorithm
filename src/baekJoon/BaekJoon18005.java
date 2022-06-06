package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18005 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int remainder = Integer.parseInt(reader.readLine()) % 4;
		
		if (remainder == 1 || remainder == 3) {
			writer.write("0");
		}
		else if (remainder == 2) {
			writer.write("1");
		}
		else {
			writer.write("2");
		}

		reader.close();
		writer.close();
	}

}