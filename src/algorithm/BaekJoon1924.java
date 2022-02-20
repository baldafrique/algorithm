package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BaekJoon1924 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		String[] str = reader.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for (int i = 0; i < x - 1; i++) {
			sum += days[i];
		}
		sum += y;
		
		writer.write(day[sum % 7]);
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
