package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2204 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		
		while (n != 0) {
			String ret = reader.readLine();
			for (int i = 0; i < n - 1; i++) {
				String tmp = reader.readLine();
				if (ret.toLowerCase().compareTo(tmp.toLowerCase()) > 0) {
					ret = tmp;
				}
			}
			writer.write(ret + "\n");
			n = Integer.parseInt(reader.readLine()); 
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
