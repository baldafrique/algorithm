import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17362 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean isASC = true;
		int n = Integer.parseInt(reader.readLine());
		int m = 0;
		
		for (int i = 1; i <= n; i++) {
			if (isASC) {
				m++;
				if (m == 5) {
					isASC = false;
				}
			}
			else {
				m--;
				if (m == 1) {
					isASC = true;
				}
			}
		}
		
		writer.write(Integer.toString(m));
		writer.flush();
		reader.close();
		writer.close();
	}

}
