package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20352 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(reader.readLine());
		double r = Math.sqrt(a / Math.PI);
		double l = 2 * Math.PI * r;
		writer.write(Double.toString(l));
		reader.close();
		writer.close();
	}
}
