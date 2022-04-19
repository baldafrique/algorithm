import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1181A {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		String temp;
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = reader.readLine();
		}
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (words[i].length() > words[j].length()) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
				else if (words[i].length() == words[j].length()) {
					if (words[i].compareTo(words[j]) > 0) {
						temp = words[i];
						words[i] = words[j];
						words[j] = temp;
					}
				}
			}
		}
		
		String ret = "";
		for (String word : words) {
			if (!ret.contains(word)) {
				ret += word + "\n";
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}

}
