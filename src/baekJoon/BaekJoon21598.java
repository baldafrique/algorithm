package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21598 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		long n = Long.parseLong(reader.readLine());
 		
 		for (long i = 0; i < n; i++) {
 			writer.write("SciComLove\n");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
