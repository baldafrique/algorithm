package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon19602 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		int s = Integer.parseInt(reader.readLine());
 		int m = Integer.parseInt(reader.readLine());
 		int l = Integer.parseInt(reader.readLine());
 		
 		writer.write(s + 2 * m + 3 * l >= 10 ? "happy" : "sad");
 		writer.flush();
		reader.close();
		writer.close();
	}

}
