package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10797 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1 = reader.readLine();
		String[] str2 = reader.readLine().split(" ");
		int cnt = 0;
		
		for (String s : str2) {
			if (s.equals(str1)) {
				cnt++;
			}
		}
		
		writer.write(Integer.toString(cnt));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
