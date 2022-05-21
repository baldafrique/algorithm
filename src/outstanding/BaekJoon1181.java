package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = reader.readLine();
		}
		
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(words[0] + "\n");
		for (int i = 1; i < N; i++) {
			if (!words[i].equals(words[i - 1])) {
				stringBuilder.append(words[i] + "\n");		
			}
		}
		
		writer.write(stringBuilder.toString());
		writer.flush();
		reader.close();
		writer.close();
	}

}