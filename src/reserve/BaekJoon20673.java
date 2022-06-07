package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20673 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int p = Integer.parseInt(reader.readLine());
		int q = Integer.parseInt(reader.readLine());
		
		if (p <= 50 && q <= 10) {
			writer.write("White");
		}
		else if (q >= 30) {
			writer.write("Red");
		}
		else {
			writer.write("Yellow");
		}
		
		reader.close();
		writer.close();
	}

}