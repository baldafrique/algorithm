package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1264 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String vowels = "AaEeIiOoUu";
		String sentence = reader.readLine();
		while (!sentence.equals("#")) {
			int number = 0;
			for (int i = 0; i < sentence.length(); i++) {
				if (vowels.contains(sentence.substring(i, (i + 1)))) {
					number++;
				}
			}
			writer.write(number + "\n");
			sentence = reader.readLine();
		}
		
		reader.close();
		writer.close();
	}

}