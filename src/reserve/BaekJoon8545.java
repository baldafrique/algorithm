package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon8545 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = reader.readLine();
		for (int i = string.length() - 1; i >= 0; i--) {
			writer.write(string.charAt(i));
		}
		
		reader.close();
		writer.close();
	}
}
