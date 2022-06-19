package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14489 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		int C = Integer.parseInt(reader.readLine());
		
		writer.write(Integer.toString(A + B >= 2 * C ? A + B - 2 * C : A + B));
		
		reader.close();
		writer.close();
	}

}