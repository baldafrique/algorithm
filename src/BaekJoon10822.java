import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10822 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(",");
		int sum = 0;
		for (String s : str) {
			sum += Integer.parseInt(s);
		}
		writer.write(Integer.toString(sum));
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
