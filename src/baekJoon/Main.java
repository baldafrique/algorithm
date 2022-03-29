package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = reader.readLine();
		
		int X = Integer.parseInt(s.split(" ")[0]);
		int L = Integer.parseInt(s.split(" ")[1]);
		int R = Integer.parseInt(s.split(" ")[2]);
		
		if (X <= L) {
			writer.write(Integer.toString(L));
		}
		else if (X >= R) {
			writer.write(Integer.toString(R));	
		}
		else {
			writer.write(Integer.toString(X));	
		}
		
		writer.flush();
		reader.close();
		writer.close();

	}

}
