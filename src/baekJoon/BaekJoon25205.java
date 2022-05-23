package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon25205 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String vowels = "yuiophjklbnm";
		reader.readLine();
		int N = Integer.parseInt(reader.readLine());
		String s = reader.readLine();
		writer.write(vowels.contains(s.substring(N - 1)) ? "0" : "1");
		reader.close();
		writer.close();
	}

}