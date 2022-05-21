package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String string = reader.readLine();
		boolean isBalanced = true;
		
		while (!string.equals(".")) {
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == '(' || string.charAt(i) == '[') {
					stack.push(string.charAt(i));
				}
				else if (string.charAt(i) == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						isBalanced = false;
						break;
					}
					else {
						stack.pop();
					}
				}
				else if (string.charAt(i) == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						isBalanced = false;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			
			if (!stack.isEmpty()) {
				isBalanced = false;
			}
			
			writer.write((isBalanced ? "yes" : "no") + "\n");
			string = reader.readLine();
			isBalanced = true;
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}