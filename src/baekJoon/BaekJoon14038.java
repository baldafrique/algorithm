package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14038 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int win = 0;
		
		for (int i = 0; i < 6; i++) {
			if (reader.readLine().equals("W")) {
				win++;
			}
		}
		
		if (win > 4) {
			writer.write("1");
		}
		else if (win > 2) {
			writer.write("2");
		}
		else if (win > 0) {
			writer.write("3");
		}
		else {
			writer.write("-1");
		}
		reader.close();
		writer.close();
	}

}