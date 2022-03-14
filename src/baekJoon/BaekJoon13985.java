package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon13985 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		String str = reader.readLine();
      
 		writer.write(Integer.parseInt(str.substring(0, 1)) + Integer.parseInt(str.substring(4, 5)) == Integer.parseInt(str.substring(8, 9)) ? "YES" : "NO"); 
 		writer.flush();
		reader.close();
		writer.close();
	}

}
