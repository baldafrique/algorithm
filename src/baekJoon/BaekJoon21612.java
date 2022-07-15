package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21612 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int P = 5 * Integer.parseInt(reader.readLine()) - 400;
		
		writer.write(P + "\n" + (P < 100 ? 1 : P > 100 ? -1 : 0));
		reader.close();
		writer.close();
	}

}