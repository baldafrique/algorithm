import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20001 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		reader.readLine();
		input = reader.readLine();
		int cnt = 0;
		
		while (!input.equals("고무오리 디버깅 끝")) {
			if (input.equals("문제")) {
				cnt++;
			}
			else {
				if (cnt == 0) {
					cnt += 2;
				}
				else {
					cnt--;
				}
			}
			input = reader.readLine();
		}
		
		writer.write(cnt == 0 ? "고무오리야 사랑해" : "힝구");
		
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
