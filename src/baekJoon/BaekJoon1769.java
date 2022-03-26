package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1769 {
	
private static void alter(String X, int n) {
		
		if (X.length() > 1) {
			int sum = 0;
			for (int i = 0; i < X.length(); i++) {
				sum += X.charAt(i) - '0';
			}
			alter(Integer.toString(sum), ++n);
		}
		else {
			if (Integer.parseInt(X) % 3 == 0) {
				System.out.println(n + "\nYES");
			}
			else {
				System.out.println(n + "\nNO");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		alter(reader.readLine(), 0);
		reader.close();
	}
	
}
