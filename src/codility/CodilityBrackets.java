package codility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class CodilityBrackets {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		Stack<Character> stack = new Stack<>();
 		String S = "([)()]";
// 		String S = "([){{}}()]";
 		
 		if (S.length() == 0) {
 			writer.write("1");
 		}
 		
 		for (int i = 0; i < S.length(); i++) {
 			char c = S.charAt(i);
 			if (c == '{' || c == '(' || c == '[') {
 				stack.push(c);
 			}
 			else { // '}', ']', ')'인 경우
 				if (stack.isEmpty()) {
 					writer.write('0');
 					writer.flush();
 					return;
 				}
 				else {
 					char leftC = stack.pop();
 					if (leftC == '(' && c != ')') {
 						writer.write('0');
 	 					writer.flush();
 	 					return;	
 					}
 	 				else if (leftC == '[' && c != ']') {
 	 					writer.write('0');
 	 					writer.flush();
 	 					return;
 	 				}
 	 				else if (leftC == '{' && c != '}') {
 	 					writer.write('0');
 	 					writer.flush();
 	 					return;
 	 				}
 				}
 			}
 		}
 		
 		if (!stack.isEmpty()) { // 짝이 맞지 않는 경우 ("{{()}")
 			writer.write('0');
				writer.flush();
				return;
 		}
 		
 		writer.write('1');
 		writer.flush();
		reader.close();
		writer.close();
	}

}
