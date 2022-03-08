package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20254 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = reader.readLine().split(" ");
		int sum = 0;
		sum += Integer.parseInt(str[0]) * 56;
		sum += Integer.parseInt(str[1]) * 24;
		sum += Integer.parseInt(str[2]) * 14;
		sum += Integer.parseInt(str[3]) * 6;
		
		writer.write(Integer.toString(sum));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
