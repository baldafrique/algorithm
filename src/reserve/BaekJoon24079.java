package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24079 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int X = Integer.parseInt(reader.readLine());
		int Y = Integer.parseInt(reader.readLine());
		int Z = Integer.parseInt(reader.readLine());
		
		writer.write(X + Y > Z ?  "0" : "1");
		writer.flush();
		reader.close();
		writer.close();
	}

}
