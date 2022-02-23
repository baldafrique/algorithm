package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2576 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[7];
		int min = 100;
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
			if (arr[i] % 2 != 0) {
				sum += arr[i];
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			
		}
		
		writer.write(min == 100 ? "-1" : sum + "\n" + min);
		writer.flush();
		reader.close();
		writer.close();
	}

}
