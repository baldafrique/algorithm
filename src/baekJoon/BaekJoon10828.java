package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<String> stack = new Stack<>();
		String[] read;
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < num; i++) {
			read = reader.readLine().split(" ");
			switch (read[0]) {
			case "push":
				stack.push(read[1]);
				break;
			case "pop":
				if (stack.size() > 0) {
					writer.write(stack.pop() + "\n");
				}
				else {
					writer.write("-1\n");
				}
				break;
			case "size":
				writer.write(stack.size() + "\n");
				break;
			case "empty":
				writer.write((stack.empty() ? "1" : "0") + "\n");
				break;
			case "top":
				if (stack.size() > 0) {
					writer.write(stack.peek() + "\n");
				}
				else {
					writer.write("-1\n");
				}
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
