package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24294 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int side = 0;
		
		for (int i = 0; i < 4; i++) {
			side += Integer.parseInt(reader.readLine());
		}
		
		writer.write(Integer.toString(side * 2));
		writer.flush();
		reader.close();
		writer.close();
	}

}
