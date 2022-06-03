package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon5928 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int day = Integer.parseInt(stringTokenizer.nextToken());
		int hour = Integer.parseInt(stringTokenizer.nextToken());
		int minute = Integer.parseInt(stringTokenizer.nextToken());
		int sum = 0;
		
		if ((day < 11) || (day == 11 && hour < 11) || (day == 11 && hour == 11 && minute < 11)) {
			sum = -1;
		}
		else {
			if (minute < 11) {
				sum += (minute + 60) - 11;
				hour--;
			}
			else {
				sum += minute - 11;
			}
			
			if (hour < 11) {
				sum += ((hour + 24) - 11) * 60;
				day--;
			}
			else {
				sum += (hour - 11) * 60;
			}
			
			sum += (day - 11) * 24 * 60;
		}
				
		writer.write(Integer.toString(sum));
		reader.close();
		writer.close();
	}

}