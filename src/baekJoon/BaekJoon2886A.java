package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon2886A {
	public static int R, C, count;
	public static char[][] table;
	
	public static boolean isDuplicate() {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < C; i++) {
			String tmp = "";
			for (int j = count + 1; j < R; j++) {
				tmp += table[j][i];
			}
			if (set.contains(tmp)) {
				return true;
			}
			else {
				set.add(tmp);
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer s = new StringTokenizer(reader.readLine());
		R = Integer.parseInt(s.nextToken());
		C = Integer.parseInt(s.nextToken());
		table = new char[R][C];
		count = 0;
		
		for (int i = 0; i < R; i++) {
			table[i] = reader.readLine().toCharArray();
		}
		
		while (count < R) {
			if (isDuplicate()) {
				break;
			}
			count++;
		}
		
		writer.write(Integer.toString(count));
		writer.flush();
		reader.close();
		writer.close();
	}
}
