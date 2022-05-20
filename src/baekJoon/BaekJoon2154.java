package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2154 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder stringBuilder = new StringBuilder();
		String N = reader.readLine();
		
		for (int i = 1; i <= Integer.parseInt(N); i++) {
			stringBuilder.append(i);
		}
		
		writer.write(Integer.toString(stringBuilder.indexOf(N) + 1));
		writer.flush();
		reader.close();
		writer.close();
	}

}