import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon15719 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < N - 1; i++) {
			String tmp = stringTokenizer.nextToken();
			if (set.contains(tmp)) {
				writer.write(tmp);
				break;
			}
			else {
				set.add(tmp);
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
