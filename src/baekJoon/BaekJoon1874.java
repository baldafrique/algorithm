package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon1874 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0, j = 1; i < n; i++) {
			int value = Integer.parseInt(reader.readLine());
			
			while (j <= value) {
				stack.push(j++);
				stringBuilder.append("+\n");
			}
			
			if (stack.contains(value)) {
				int temp = stack.pop();
				
				stringBuilder.append("-\n");
				
				while (temp != value) {
					temp = stack.pop();
					stringBuilder.append("-\n");
				}	
			}
			else {
				stringBuilder = new StringBuilder("NO");
				break;
			}
		}
		
		writer.write(stringBuilder.toString());
		writer.flush();
		reader.close();
		writer.close();
	}

}