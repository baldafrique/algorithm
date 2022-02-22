package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2525 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		min += Integer.parseInt(reader.readLine());
		
		if (min >= 60) {
			while (min >= 60) {
				min -= 60;
				hour++;
			}
			if (hour > 23) {
				hour -= 24;
			}
		}
		writer.write(hour + " " + min);
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
