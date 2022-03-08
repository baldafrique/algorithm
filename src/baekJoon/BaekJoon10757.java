package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10757 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		// str1이 str2보다 길거나 같음
		String str1 = str[0].length() > str[1].length() ? str[0] : str[1];
		String str2 = str[0].length() > str[1].length() ? str[1] : str[0];
		int index1 = str1.length() - 1;
		int index2 = str2.length() - 1;
		String str3 = "";
		int carry = 0;
		int sum;
		
		for (int i = index2; i >= 0; i--) {
			sum = (str1.charAt(index1--) - '0') + (str2.charAt(index2--) - '0') + carry;
			if (sum >= 10) {
				while (sum >= 10) {
					carry = 0;
					sum -= 10;
					carry++;
				}
			}
			else {
				carry = 0;
			}
			str3 += sum;
		}
		
		// str1.length() == str2.length()
		if (str1.length() == str2.length() && carry != 0) {
			str3 += carry;
		}
		else { // str1 .length() > str2.length()
			for (int i = index1 - index2 - 1; i >=0; i--) {
				sum = str1.charAt(i) - '0' + carry;
				if (sum >= 10) {
					while (sum >= 10) {
						carry = 0;
						sum -= 10;
						carry++;
					}
				}
				else {
					carry = 0;
				}
				str3 += sum;
				if (i == 0 && carry != 0) {
					str3 += carry;
				}
			}
		}
		
		for (int i = str3.length() - 1; i >= 0; i--) {
			writer.write(str3.charAt(i));
		}
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
