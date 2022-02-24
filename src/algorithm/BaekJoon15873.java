package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15873 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		String str1 = null;
		String str2 = null;
		
		if (str.length() == 2) {
			str1 = str.substring(0, 1);
			str2 = str.substring(1);
		}
		else if (str.length() == 3) {
			if (str.charAt(2) == '0') {
				str1 = str.substring(0, 1);
				str2 = str.substring(1);
			}
			else {
				str1 = str.substring(0, 2);
				str2 = str.substring(2);
			}
		}
		
		writer.write(str.length() < 4 ? Integer.toString(Integer.parseInt(str1) + Integer.parseInt(str2)) : "20");
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
