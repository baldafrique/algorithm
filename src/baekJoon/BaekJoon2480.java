package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2480 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] num = new int[3];
		String[] str = reader.readLine().split(" ");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		
		if (num[0] == num[1] && num[1] == num[2]) {
			writer.write(Integer.toString(10000 + 1000 * num[0]));
		}
		else if (num[0] == num[1] && num[1] != num[2]) {
			writer.write(Integer.toString(1000 + 100 * num[0]));
		}
		else if (num[0] == num[2] && num[0] != num[1]) {
			writer.write(Integer.toString(1000 + 100 * num[0]));
		}
		else if (num[1] == num[2] && num[0] != num[1]) {
			writer.write(Integer.toString(1000 + 100 * num[1]));
		}
		else {
			writer.write(Integer.toString(100 * num[2]));
		}	
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
