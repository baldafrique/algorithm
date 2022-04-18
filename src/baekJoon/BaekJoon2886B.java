package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon2886B {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer s = new StringTokenizer(reader.readLine());
		int R = Integer.parseInt(s.nextToken());
		int C = Integer.parseInt(s.nextToken());
		char[][] table = new char[R][C];
		String[] arr = new String[C];
		int count = 0;
		
		for (int i = 0; i < R; i++) {
			table[i] = reader.readLine().toCharArray();
		}
		
		for (int i = 0; i < C; i++) {
			arr[i] = "";
			for (int j = 1; j < R; j++) {
				arr[i] += table[j][i];
			}
		}
		
		outerloop:
		for (int i = 0; i < R; i++) {
			Set<String> set = new HashSet<>();
			for (int j = 0; j < C; j++) {
				String tmp = arr[j].substring(i);
				if (set.contains(tmp)) {
					break outerloop;
				}
				else {
					set.add(tmp);
				}
			}
			count++;
		}
		
		writer.write(Integer.toString(count));
		writer.flush();
		reader.close();
		writer.close();
	}
}
