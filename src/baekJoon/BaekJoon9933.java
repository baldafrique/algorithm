package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9933 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		String[] str = new String[num];
		String pw = null;
		
		for (int i = 0; i < num; i++) {
			str[i] = reader.readLine();
		}
		
		for (int i = 0; i < num - 1; i++) {
			StringBuffer sb = new StringBuffer(str[i]);
			for (int j = 0; j < num; j++) {
				sb = sb.reverse();
				if (sb.toString().equals(str[j])) {
					pw = str[j];
				}
				sb.reverse();
			}
		}
		
		writer.write(pw.length() + " " + pw.charAt(pw.length() / 2));
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
