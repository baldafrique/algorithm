package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2506 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		@SuppressWarnings("unused")
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int combo = 0;
		int score = 0;
		
		while (stringTokenizer.hasMoreTokens()) {
			if (stringTokenizer.nextToken().equals("1")) {
				score += ++combo;
			}
			else {
				combo = 0;
			}
		}
		
		writer.write(Integer.toString(score));
		reader.close();
		writer.close();
	}

}