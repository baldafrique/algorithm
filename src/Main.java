import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

//		String[] s = {"aaa", "aa", "a"};
//		String t;
//		
//		System.out.println(Arrays.toString(s));
//		
//		for (int i = 0; i < s.length - 1; i++) {
//			for (int j = i + 1; j < s.length; j++) {
//				if (s[i].length() > s[j].length()) {
//					t = s[i];
//					s[i] = s[j];
//					s[j] = t;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(s));
		
		int N = Integer.parseInt(reader.readLine());
		String temp;
		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = reader.readLine();
		}
		System.out.println(Arrays.toString(words));
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (words[i].length() > words[j].length()) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(words));
		writer.flush();
		reader.close();
		writer.close();
	}

}
