package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon9012 {
	
	public static String check(String S) {
		Stack<Character> stack = new Stack<>();
		
		if (S.length() == 0) {
 			return "YES";
 		}
 		
 		for (int i = 0; i < S.length(); i++) {
 			char c = S.charAt(i);
 			if (c == '{' || c == '(' || c == '[') {
 				stack.push(c);
 			}
 			else { // '}', ']', ')'인 경우
 				if (stack.isEmpty()) {
 					return "NO";
 				}
 				else {
 					char leftC = stack.pop();
 					if (leftC == '(' && c != ')') {
 						return "NO";
 					}
 	 				else if (leftC == '[' && c != ']') {
 	 					return "NO";
 	 				}
 	 				else if (leftC == '{' && c != '}') {
 	 					return "NO";
 	 				}
 				}
 			}
 		}
 		
 		if (!stack.isEmpty()) { // 짝이 맞지 않는 경우 ("{{()}")
 			return "NO";
 		}
 		
 		return "YES";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int n = Integer.parseInt(reader.readLine());
 		for (int i = 0; i < n; i++) {
 			writer.write(check(reader.readLine()) + "\n");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
