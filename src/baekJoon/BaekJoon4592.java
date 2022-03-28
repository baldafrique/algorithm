package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BaekJoon4592 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] data = new int[25];
		int dataI = 0;
		String[] str = reader.readLine().split(" ");
		
		while (!str[0].equals("0")) {
			data[dataI++] = Integer.parseInt(str[1]);
			
			for (int strI = 2; strI < str.length; strI++) {
				if (data[dataI - 1] != Integer.parseInt(str[strI])) {
					data[dataI++] = Integer.parseInt(str[strI]);
				}
			}
			
			for (int i = 0; i < 25 && data[i] != 0; i++) {
				writer.write(data[i] + " ");
			}
			
			writer.write("$\n");
			data = new int[25];
			dataI = 0;
			str = reader.readLine().split(" ");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
	
}