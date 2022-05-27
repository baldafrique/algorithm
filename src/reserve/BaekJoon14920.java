package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14920 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int Cn = Integer.parseInt(reader.readLine());
		int n = 1;
		
		while (Cn != 1) {
			Cn = (Cn % 2 == 0 ? Cn / 2 : 3 * Cn + 1);
			n++;
		}
		
		writer.write(Integer.toString(n));
		reader.close();
		writer.close();
	}

}