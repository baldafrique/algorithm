package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3040 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		int[] num = new int[9];
		for (int i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(reader.readLine());
			sum += num[i];
		}
		
		Loop:
		for(int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - (num[i] + num[j]) == 100) {
					num[i] = 0;
					num[j] = 0;
					break Loop;
				}
			}
		}
		
		for (int i : num) {
			if (i != 0) {
				writer.write(i + "\n");
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
