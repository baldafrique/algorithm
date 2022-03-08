package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10988 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		String str1, str2;
		boolean flag = true;
		if (str.length() % 2 == 0) {
			str1 = str.substring(0, str.length() / 2);
			str2 = str.substring(str.length() / 2);
		}
		else {
			str1 = str.substring(0, (int) (Math.floor(str.length() / 2.0)));
			str2 = str.substring((int) (Math.ceil(str.length() / 2.0)));
		}
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str1.charAt(i) != str2.charAt(str2.length() - (i + 1))) {
				flag = false;
				break;
			}
		}
		
		writer.write(flag ? "1" : "0");
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
