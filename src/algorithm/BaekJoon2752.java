package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2752 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		
		for (int i : num) {
			writer.write(i + " ");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
