package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int cnt = 0;
		int sum = 0;
		
		for (int k = 1; k < 46; k++) {
			for (int i = 1; i <= k; i++) {
				cnt++;
				if (A <= cnt && cnt <= B) {
					sum += k;
				}
			}
		}
		
		writer.write(Integer.toString(sum));
		writer.flush();
		reader.close();
		writer.close();

	}

}
