import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5598 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		String ret = "";
		
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'C') {
				ret += (char) (str.charAt(i) + 23);
			}
			else {
				ret += (char) (str.charAt(i) - 3);
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}
}
