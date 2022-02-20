package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2161 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Integer> queue = new LinkedList<>();
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < num; i++) {
			queue.add(i + 1);
		}
		
		while (queue.size() > 1) {
			writer.write(queue.poll() + " ");
			queue.add(queue.poll());
		}
		writer.write(Integer.toString(queue.poll()));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
