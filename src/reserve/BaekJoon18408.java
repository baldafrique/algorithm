package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18408 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		int oneNumber = 0;
		
		for (int i = 0; i < 3; i++) {
			if (input.split(" ")[i].equals("1")) {
				oneNumber++;
			}
		}
		
		writer.write(oneNumber > 1 ? "1" : "2");
		reader.close();
		writer.close();
	}

}