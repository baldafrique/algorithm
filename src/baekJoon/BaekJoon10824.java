package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String str = reader.readLine();
 		
 		writer.write(Long.toString(Long.parseLong(str.split(" ")[0] + str.split(" ")[1]) + Long.parseLong(str.split(" ")[2] + str.split(" ")[3])));
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
