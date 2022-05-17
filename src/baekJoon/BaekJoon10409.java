package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10409 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer; 

		stringTokenizer = new StringTokenizer(reader.readLine());
		@SuppressWarnings("unused")
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int T = Integer.parseInt(stringTokenizer.nextToken());
		int count = 0;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		while (stringTokenizer.hasMoreTokens()) {
			int minute = Integer.parseInt(stringTokenizer.nextToken());
			if (T - minute >= 0) {
				T -= minute;
				count++;
			}
			else {
				break;
			}
		}
		
		writer.write(Integer.toString(count));
		reader.close();
		writer.close();
	}
}
