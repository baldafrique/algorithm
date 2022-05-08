package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11549 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String answer = reader.readLine();
		String answers = reader.readLine().replaceAll(answer, "").replaceAll(" ", "");
		writer.write(Integer.toString(5 - answers.length()));
		reader.close();
		writer.close();
	}
}
