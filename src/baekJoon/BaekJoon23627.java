package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon23627 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = reader.readLine();
		if (S.length() < 5) {
			writer.write("not cute");
		}
		else {
			writer.write(S.substring(S.length() - 5).equals("driip") ? "cute" : "not cute");	
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
