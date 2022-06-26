package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon21866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		boolean isHacker = false;
		int perfectScore = 100;
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
			int score = Integer.parseInt(stringTokenizer.nextToken());
			if (score > perfectScore) {
				isHacker = true;
				break;
			}
			else {
				sum += score;
			}
			if (i % 2 == 0) {
				perfectScore += 100;
			}
		}
		
		writer.write(isHacker ? "hacker" : sum < 100 ? "none" : "draw");
		reader.close();
		writer.close();
	}

}