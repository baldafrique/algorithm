package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NotationConversion {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int x = Integer.parseInt(reader.readLine());
 		int r = Integer.parseInt(reader.readLine());
 		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 		String str = "";
 		
 		while (x > 0) {
 			str += dchar.charAt(x % r);
 			x /= r;
 		}
 		
 		for (int i = str.length() - 1; i >= 0; i--) {
 			writer.write(str.charAt(i));
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
