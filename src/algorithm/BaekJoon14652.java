package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14652 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		int m = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		
		writer.write(k / m + " " + k % m);
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
