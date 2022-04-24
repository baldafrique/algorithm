package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class BaekJoon2954 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		String ret = "";
		HashSet<Character> vowel = new HashSet<>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		
		for (int i = 0; i < str.length(); i++) {
			ret += str.charAt(i);
			if (vowel.contains(str.charAt(i))) {
				i += 2;
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}

}
