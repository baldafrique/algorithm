package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon8658 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 2; i < n; i++) {
			if (n % i != 0) {
				writer.write(i + " ");
				break;
			}
		}
		
		for (int i = n - 1; i > 1; i--) {
			if (n % i != 0) {
				writer.write(i + " ");
				break;
			}
		}
		reader.close();
		writer.close();
	}

}