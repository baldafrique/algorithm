import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2857 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = new String[5];
		String ret = "";
		
		for (int i = 0; i < 5; i++) {
			str[i] = reader.readLine();
			if (str[i].indexOf("FBI") >= 0) {
				ret += (i + 1) + " ";
			}
		}
		
		writer.write(ret.length() == 0 ? "HE GOT AWAY!" : ret);
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
