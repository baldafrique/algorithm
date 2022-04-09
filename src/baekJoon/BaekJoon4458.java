package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4458 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		String str;
		String tmp;
		
		for (int i = 0; i < N; i++) {
			str = reader.readLine();
			tmp = str.toUpperCase().charAt(0) + str.substring(1);
			writer.write(tmp + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
