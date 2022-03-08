package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21300 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			cnt += Integer.parseInt(str[i]);
		}
		
		writer.write(Integer.toString(cnt * 5));
		writer.flush();
		reader.close();
		writer.close();
	}

}
