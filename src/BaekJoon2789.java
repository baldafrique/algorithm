import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon2789 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
		Set<Character> set = new HashSet<>();
		set.add('C');
		set.add('A');
		set.add('M');
		set.add('B');
		set.add('R');
		set.add('I');
		set.add('D');
		set.add('G');
		set.add('E');
		String str = reader.readLine();
		String ret = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				ret += str.charAt(i);
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}
}
