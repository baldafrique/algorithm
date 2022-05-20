package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10801 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizerA = new StringTokenizer(reader.readLine());
		StringTokenizer stringTokenizerB = new StringTokenizer(reader.readLine());
		int countA = 0;
		int countB = 0;
		
		for (int i = 0; i < 10; i++) {
			int cardA = Integer.parseInt(stringTokenizerA.nextToken());
			int cardB = Integer.parseInt(stringTokenizerB.nextToken());
			if (cardA > cardB) {
				countA++;
			}
			else if (cardA < cardB) {
				countB++;
			}
		}
		
		writer.write(countA > countB ? "A" : countA < countB ? "B" : "D");
		writer.flush();
		reader.close();
		writer.close();
	}

}