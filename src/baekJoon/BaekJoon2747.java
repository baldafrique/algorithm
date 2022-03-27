package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2747 {
	
	static int[] memo = new int[46];
	
	static int recursion(int n) {
		if (memo[n] != 0) {
			return memo[n];
		}
		else if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			memo[n] = recursion(n - 1) + recursion(n - 2); 
			return recursion(n - 1) + recursion(n - 2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		writer.write(Integer.toString(recursion(Integer.parseInt(reader.readLine()))));
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
