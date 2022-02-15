package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Queue<String> data = new LinkedList<>();
		int num = Integer.parseInt(reader.readLine());
		String[] line;
		String back = null;
		String temp;
		
		for (int i = 0; i < num; i++) {
			line = reader.readLine().split(" ");
			switch (line[0]) {
			case "push":
				data.add(line[1]);
				back = line[1];
				break;
			case "pop":
				temp = data.poll();
				writer.write((temp == null ? "-1" : temp) + "\n");
				break;
			case "size":
				writer.write(data.size() + "\n");
				break;
			case "empty":
				writer.write((data.isEmpty() ? "1" : "0") + "\n");
				break;
			case "front":
				writer.write((data.peek() == null ? "-1" : data.peek()) + "\n");
				break;
			case "back":
				writer.write((data.size() > 0 ? back : "-1") + "\n");
				break;
			default: 
					break;
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
