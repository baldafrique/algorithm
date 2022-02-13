package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		ArrayList<Integer> height = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			height.add(Integer.parseInt(reader.readLine())); 
			sum += height.get(i);
		}
		
		Outer:
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - (height.get(i) + height.get(j)) == 100) {
					height.remove(j);
					height.remove(i);
					break Outer;
				}
			}
		}
		
		Collections.sort(height);
		for (Integer integer : height) {
			writer.write(integer + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
