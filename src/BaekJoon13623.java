import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon13623 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		char[] state = new char[3];
		
		for (int i = 0; i < 3; i++) {
			state[i] = stringTokenizer.nextToken().charAt(0);
		}
		
		Loop:
		for (int i = 0; i < 3; i++) {
			Set<Character> set = new HashSet<>();
			char[] temp = state.clone();
			temp[i] = state[i] == '0' ? '1' : '0';
			for (char c : temp) {
				set.add(c);
			}
			if (set.size() == 1) {
				switch (i) {
				case 0:
					writer.write('A');
					break Loop;
				case 1:
					writer.write('B');
					break Loop;
				case 2:
					writer.write('C');
					break Loop;
				}
			}
			else if (i == 2) {
				writer.write('*');
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
