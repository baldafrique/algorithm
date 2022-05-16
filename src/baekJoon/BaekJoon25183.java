package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon25183 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		String S = reader.readLine();
		int count = 0;
		boolean win = false;
		
		for (int i = 0; i < N - 1; i++) {
			char now = S.charAt(i);
			char next = S.charAt(i + 1);
			
			if (now == 'A' && next == 'B') {
				count++;
			}
			else if (now == 'Z' && next == 'Y') {
				count++;
			}
			else if (now - 1 == next || now + 1 == next) {
				count++;
			}
			else {
				count = 0;
			}
			
			if (count == 4) {
				win = true;
				break;
			}
		}
		
		writer.write(win ? "YES" : "NO");
		writer.flush();
		reader.close();
		writer.close();
	}
}