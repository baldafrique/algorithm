package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15354 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(reader.readLine());
		String list = reader.readLine();
		int index = 0;
		
		for (int i = 0; i < number - 1; i++) {
			char color = reader.readLine().charAt(0);
			if (list.charAt(index) != color) {
				list += color;
				index++;
			}
		}
		
		writer.write(Integer.toString(list.length() + 1));
		reader.close();
		writer.close();
	}
}
