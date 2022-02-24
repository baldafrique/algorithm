package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon10866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> deque = new ArrayDeque<>();
		int num = Integer.parseInt(reader.readLine());
		String[] str;
		for (int i = 0; i < num; i++) {
			str = reader.readLine().split(" ");
			switch (str[0]) {
			case "push_front":
				deque.addFirst(Integer.parseInt(str[1]));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(str[1]));
				break;
			case "pop_front":
				writer.write((deque.size() == 0 ? "-1" : deque.pollFirst()) + "\n");
				break;
			case "pop_back":
				writer.write((deque.size() == 0 ? "-1" : deque.pollLast()) + "\n");
				break;
			case "size":
				writer.write(deque.size() + "\n");
				break;
			case "empty":
				writer.write((deque.isEmpty() ? "1" : "0") + "\n");
				break;
			case "front":
				writer.write((deque.size() == 0 ? "-1" : deque.getFirst()) + "\n");
				break;
			case "back":
				writer.write((deque.size() == 0 ? "-1" : deque.getLast()) + "\n");
				break;
			default :
				
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
