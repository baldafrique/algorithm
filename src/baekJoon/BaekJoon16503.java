package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon16503 {
	private static int calculate(int operand1, char operator, int operand2) {
		switch (operator) {
			case '+':
				return operand1 + operand2;
			case '-':
				return operand1 - operand2;
			case '*':
				return operand1 * operand2;
			case '/':
				return operand1 / operand2;
			default :
				return -1;
		} 
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int K1 = Integer.parseInt(stringTokenizer.nextToken());
		char O1 = stringTokenizer.nextToken().charAt(0);
		int K2 = Integer.parseInt(stringTokenizer.nextToken());
		char O2 = stringTokenizer.nextToken().charAt(0);
		int K3 = Integer.parseInt(stringTokenizer.nextToken());
		
		int result1 = calculate(calculate(K1, O1, K2), O2, K3);
		int result2 = calculate(K1, O1, calculate(K2, O2, K3));
		
		writer.write(result1 > result2 ? (result2 + "\n" + result1) : (result1 + "\n" + result2));
		reader.close();
		writer.close();
	}

}