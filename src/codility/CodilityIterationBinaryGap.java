package codility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CodilityIterationBinaryGap {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = Integer.toBinaryString(Integer.parseInt(reader.readLine())).split("");
		@SuppressWarnings("unused")
		boolean flag = false;
		int max = 0;
		int cnt = 0;
		
		for (String s : arr) {
			if (flag = true && s.equals("0")) {
				cnt++;
			}
			else if (flag = true && s.equals("1")) {
				flag = false;
				if (max < cnt) {
					max = cnt;
				}
				cnt = 0;
			}
			if (s.equals("1")) {
				flag = true;
			}
		}
		
		writer.write(Integer.toString(max));
		writer.flush();
		reader.close();
		writer.close();
	}

}
