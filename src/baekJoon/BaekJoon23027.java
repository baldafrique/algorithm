package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon23027 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = reader.readLine();
		
		if (S.contains("A")) {
			S = S.replaceAll("B", "A").replaceAll("C", "A").replaceAll("D", "A").replaceAll("F", "A");
		}
		else if (S.contains("B")) {
			S = S.replaceAll("C", "B").replaceAll("D", "B").replaceAll("F", "B");
		}
		else if (S.contains("C")) {
			S = S.replaceAll("D", "C").replaceAll("F", "C");
		}
		else {
			int length = S.length();
			S = "";
			for (int i = 0; i < length; i++) {
				S += "A";
			}
		}
		
		writer.write(S);
		reader.close();
		writer.close();
	}

}