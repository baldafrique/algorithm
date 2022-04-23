import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon14909 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String numbers = reader.readLine();
		StringTokenizer stringTokenizer = new StringTokenizer(numbers);
		int cnt = 0;
		
		while (stringTokenizer.hasMoreTokens()) {
			if (Integer.parseInt(stringTokenizer.nextToken()) > 0) {
				cnt++;
			}
		}
		
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}
}
