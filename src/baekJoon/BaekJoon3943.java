package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3943 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(reader.readLine());
			int max = n;
			while (n > 1) {
				if (n % 2 == 0) {
					n /= 2;
				}
				else {
					n = n * 3 + 1;
				}
				if (max < n) {
					max = n;
				}
			}
			writer.write(max + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}