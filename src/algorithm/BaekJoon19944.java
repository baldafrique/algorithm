package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon19944 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		if (m < 3) {
			writer.write("NEWBIE!");
		}
		else if (m <= n) {
			writer.write("OLDBIE!");
		}
		else {
			writer.write("TLE!");
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
