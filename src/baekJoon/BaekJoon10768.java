package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10768 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int m = Integer.parseInt(reader.readLine());
 		int d = Integer.parseInt(reader.readLine());
 		
 		if (m < 2 || (m <= 2 && d < 18)) {
 			writer.write("Before");
 		}
 		else if (m == 2 && d == 18) {
 			writer.write("Special");
 		}
 		else {
 			writer.write("After");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
