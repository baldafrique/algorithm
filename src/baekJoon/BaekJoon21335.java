package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21335 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long area = Long.parseLong(reader.readLine());
		
		double radius = Math.sqrt(area / Math.PI);
		
		double length = 2 * Math.PI * radius;
		writer.write(Double.toString(length));
		
		writer.flush();
		reader.close();
		writer.close();

	}

}
