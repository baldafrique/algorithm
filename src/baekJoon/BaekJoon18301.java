package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18301 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		writer.write(Integer.toString((int) Math.floor((num[0] + 1) * (num[1] + 1) / (num[2] + 1) - 1)));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
