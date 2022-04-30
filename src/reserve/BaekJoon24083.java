package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24083 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		int C = (A + B) % 12;
		
		writer.write(Integer.toString(C == 0 ? 12 : C));
		writer.flush();
		reader.close();
		writer.close();
	}
}
