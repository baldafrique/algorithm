package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17256 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] a = new int[3];
		int[] c = new int[3];
		String[] str;
		
		str = reader.readLine().split(" ");
		for (int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		str = reader.readLine().split(" ");
		for (int i = 0; i < 3; i++) {
			c[i] = Integer.parseInt(str[i]);
		}
		
		writer.write(c[0] - a[2] + " " + c[1] / a[1] + " " + (c[2] - a[0]));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
