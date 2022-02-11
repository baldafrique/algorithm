package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		int num = Integer.parseInt(reader.readLine());
		int next;
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			next = Integer.parseInt(reader.readLine());
			if (next != 0) {
				list.add(next);
			}
			else {
				list.remove(list.size() - 1);
			}
		}
		
		for (Integer i : list) {
			sum += i;
		}
		
		writer.write(Integer.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}

}
