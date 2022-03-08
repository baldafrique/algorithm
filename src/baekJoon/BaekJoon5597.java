package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] submit = new int[30];
		
		for (int i = 0; i < 28; i++) {
			submit[Integer.parseInt(reader.readLine()) - 1]++;
		}
		
		int[] people = new int[2];
		int index = 0;
		
		for (int i = 0; i < submit.length; i++) {
			if (submit[i] == 0) {
				people[index++] = i + 1;
			}
		}
		
		writer.write((people[0] > people[1] ? people[1] : people[0]) + "\n" + (people[0] > people[1] ? people[0] : people[1]));
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
