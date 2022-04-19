import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16486 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int d1 = Integer.parseInt(reader.readLine());
		int d2 = Integer.parseInt(reader.readLine());
		writer.write(Double.toString(2 * (d1 + d2 * Math.PI)));
		writer.flush();
		reader.close();
		writer.close();
	}
}
