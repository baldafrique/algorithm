package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4892 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n0 = Integer.parseInt(reader.readLine());
		int i = 1;
		while (n0 != 0) {
			int n1 = 3 * n0;
			int n2 = (n1 % 2 == 0 ? n1 / 2 : (n1 + 1) / 2);
			int n4 = 3 * n2 / 9;
			writer.write(i + ". " + (n1 % 2 == 0 ? "even" : "odd") + " " + n4 + "\n");
			n0 = Integer.parseInt(reader.readLine());
		}
		reader.close();
		writer.close();
	}

}