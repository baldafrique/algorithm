package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11655 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if ('A' <= str[i].charAt(j) && str[i].charAt(j) <= 'Z') {  
					if (str[i].charAt(j) + 13 > 'Z') {
						writer.write(str[i].charAt(j) - 13);
					}
					else {
						writer.write(str[i].charAt(j) + 13);
					}
				}
				else if ('a' <= str[i].charAt(j) && str[i].charAt(j) <= 'z') { 
					if (str[i].charAt(j) + 13 > 'z') {
						writer.write(str[i].charAt(j) - 13);
					}
					else {
						writer.write(str[i].charAt(j) + 13);
					}
				}
				else {
					writer.write(str[i].charAt(j));
				}
			}
			writer.write(" ");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
