package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon4299 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		
		// num1이 정수가 아닌 경우
		if ((Integer.parseInt(str[0]) + Integer.parseInt(str[1])) % 2 != 0) {
			writer.write("-1");
		}
		else {
			int num1 = (Integer.parseInt(str[0]) + Integer.parseInt(str[1])) / 2;
			int num2 = Integer.parseInt(str[0]) - num1;
			
			if (num2 < 0) {
				writer.write("-1");
			}
			else {
				writer.write(num1 + " " + num2);
			}
			
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
