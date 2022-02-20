// Unsolved

package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2193 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int digit = Integer.parseInt(reader.readLine());
		String str = "1";
		
		while (str.length() < digit) {
			str += "0";
		}
		
		while (str.length() <= digit) {
			for (int i = 0; i < 3; i++) {
				
			}
		}
		
//		while (temp.length() <= digit) {
//			if (temp.charAt(0) != '0' && !temp.contains("11")) {
//				cnt++;
//			}
//			temp = Integer.toBinaryString(Integer.parseInt(Integer.toString(++value)));
//		}
		
		
		
//		writer.write(Integer.toString(cnt));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
