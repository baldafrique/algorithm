package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2108 { // unsolved

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int median, mode, range; // 중앙값, 최빈값, 범위
		float mean = 0; // 평균
		int num = Integer.parseInt(reader.readLine());
		int[] log = new int[500000];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(Integer.parseInt(reader.readLine()));
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			mean += list.get(i);
			log[list.get(i) - 1]++;
		}
		int count = 0;
		int maxIndex = 0;
		int counter = 0;
		for (int i : log) {
			if (log[i] > count) {
				maxIndex = i;
			}
		}
		
		for (int i = 500000; i >= 0; i--) {
			if (log[i] == log[maxIndex]) {
				counter++;
			}
			if (counter > 1) {
				// log[i]
				writer.write(log[i] + "\n");
			}
		}
		if (counter == 1) {
			// log[maxIndex]
			writer.write(log[maxIndex] + "\n");
		}
		
		mean /= num;
		median = list.get(num / 2);
		range = list.get(num - 1) - list.get(0);
		writer.write(Math.round(mean) + "\n");
		writer.write(median + "\n");
		writer.write(range + "\n");
		writer.flush();
		reader.close();
		writer.close();
	}

}
