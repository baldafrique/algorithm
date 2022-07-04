package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon25314 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = (int) Math.ceil(Double.parseDouble(reader.readLine()) / 4);
		
		for (int i = 0; i < N; i++) {
			writer.write("long ");
		}
		
		writer.write("int");
		writer.flush();
		reader.close();
		writer.close();
	}

}
