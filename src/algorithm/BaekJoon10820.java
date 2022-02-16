package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int upper = 0;
		int lower = 0;
		int number = 0;
		int space = 0;
		
		while(str != null) {
			for (int i = 0; i < str.length(); i++) {
				if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
					upper++;
				}
				else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
					lower++;
				}
				else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					number++;
				}
				else if ((int) str.charAt(i) == 32) {
					space++;
				}
			}
			writer.write(lower + " " + upper + " " + number + " " + space + "\n");
			upper = 0; 
			lower = 0; 
			number = 0; 
			space = 0;
			str = reader.readLine();
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
