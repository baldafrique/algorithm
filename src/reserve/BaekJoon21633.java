package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21633 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		double commission = 25 + Integer.parseInt(reader.readLine()) * 0.01;
		System.out.printf("%.2f", commission < 100 ? 100 : commission > 2000 ? 2000 : commission);
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
