// unsolved

package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10994 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = 4 * Integer.parseInt(reader.readLine()) - 3;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num || j == 1 || j == num) {
					writer.write('*');
				}
				else if (i % 2 != 0 && j % 2 != 0) {
					writer.write('*');
				}
				else {
					writer.write('!');
				}
				
			}
			
			
			writer.write('\n');
		}
		
		
		
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
