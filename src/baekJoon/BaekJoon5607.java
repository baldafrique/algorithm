package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon5607 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		int A = 0;
		int B = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int ACard = Integer.parseInt(stringTokenizer.nextToken());
			int BCard = Integer.parseInt(stringTokenizer.nextToken());
			if (ACard > BCard) {
				A += ACard + BCard;
			}
			else if (ACard < BCard) {
				B += ACard + BCard;
			}
			else {
				A += ACard;
				B += BCard;
			}
		}
		
		writer.write(A + " " + B);
		reader.close();
		writer.close();
	}
}
