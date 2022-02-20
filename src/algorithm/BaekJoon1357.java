package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1357 {
	
	public static int rev(String str) {
		String num = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			num += str.charAt(i);
		}
		return Integer.parseInt(num);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		writer.write(Integer.toString(rev(Integer.toString(rev(str[0]) + rev(str[1])))));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
