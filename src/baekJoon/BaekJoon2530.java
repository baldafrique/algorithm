package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2530 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String[] arr = reader.readLine().split(" ");
 		
 		
 		int currentHour = Integer.parseInt(arr[0]);
 		int currentMin = Integer.parseInt(arr[1]);
 		int currentSec = Integer.parseInt(arr[2]);
 		int sec = Integer.parseInt(reader.readLine());
 		int hour = sec / 3600;
 		sec %= 3600;
 		int min = sec / 60;
 		sec %= 60;
 		int quotient;
 		
 		currentSec += sec;
 		if (currentSec >= 60) {
 			quotient = currentSec / 60;
 			currentMin += quotient;
 			currentSec %= 60;
 		}
 		
 		currentMin += min;
 		if (currentMin >= 60) {
 			quotient = currentMin / 60;
 			currentHour += quotient;
 			currentMin %= 60;
 		}
 		
 		currentHour += hour;
 		if (currentHour >= 24) {
 			currentHour %= 24;
 		}
 		
 		writer.write(currentHour + " " + currentMin + " " + currentSec);
 		writer.flush();
		reader.close();
		writer.close();
	}

}
