package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon8545 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = reader.readLine();
		String reverse = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		
		writer.write(reverse);
		reader.close();
		writer.close();
	}

}