package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5532 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int days = Integer.parseInt(reader.readLine());
		int koreanRange = Integer.parseInt(reader.readLine());
		int mathRange = Integer.parseInt(reader.readLine());
		int koreanDay = Integer.parseInt(reader.readLine());
		int mathDay = Integer.parseInt(reader.readLine());
		
		if (koreanRange % koreanDay == 0) {
			koreanDay = koreanRange / koreanDay;
		}
		else {
			koreanDay = koreanRange / koreanDay + 1;
		}
		
		if (mathRange % mathDay == 0) {
			mathDay = mathRange / mathDay;
		}
		else {
			mathDay = mathRange / mathDay + 1;
		}
		
		writer.write(Integer.toString(days - (koreanDay > mathDay ? koreanDay : mathDay)));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
