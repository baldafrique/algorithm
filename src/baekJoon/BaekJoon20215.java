package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20215 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int w = Integer.parseInt(str.split(" ")[0]);
		int h = Integer.parseInt(str.split(" ")[1]);
		double d = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
		
		writer.write(Double.toString(w + h - d));
		
		writer.flush();
		reader.close();
		writer.close();

	}

}
