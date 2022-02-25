package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2420 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		long[] num = new long[2];
		num[0] = Long.parseLong(str[0]);
		num[1] = Long.parseLong(str[1]);
		writer.write(Long.toString(Math.abs(num[0] - num[1])));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
