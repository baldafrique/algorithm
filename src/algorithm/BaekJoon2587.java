package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] num = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(reader.readLine());
			sum += num[i];
		}
		Arrays.sort(num);
		writer.write(sum / 5 + "\n" + num[2]);
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
