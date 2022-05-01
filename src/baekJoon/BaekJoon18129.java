package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon18129 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		String S = stringTokenizer.nextToken().toLowerCase();
		int K = Integer.parseInt(stringTokenizer.nextToken());
		int count = 1;
		String code = "";
		String record = "";
		
		for (int i = 0; i < S.length(); i++) {
			if (i < S.length() - 1 && S.charAt(i) == S.charAt(i + 1)) {
				count++;
			}
			else {
				if (record.contains(Character.toString(S.charAt(i)))) {
					continue;
				}
				else if (count >= K) {
					code += "1";
				}
				else {
					code += "0";
				}
				record += S.charAt(i);
				count = 1;
			}
		}
		
		writer.write(code);
		reader.close();
		writer.close();
	}
}
