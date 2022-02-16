package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		int count = 0;
		int value = 0;
		for (int i = 666; count < num; i++) {
			if (Integer.toString(i).contains("666")) {
				value = i;
				count++;
			}
		}
		writer.write(Integer.toString(value));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
