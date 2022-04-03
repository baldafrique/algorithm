package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24883 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		char c = reader.readLine().charAt(0);
		
		writer.write(c == 'N' || c == 'n' ? "Naver D2" : "Naver Whale");
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
