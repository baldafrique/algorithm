package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5717 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String str = reader.readLine();
 		while (!str.equals("0 0")) {
 			writer.write(Integer.parseInt(str.split(" ")[0]) + Integer.parseInt(str.split(" ")[1]) + "\n");
 			str = reader.readLine();
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
