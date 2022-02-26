package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5543 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int burgerMin = Integer.parseInt(reader.readLine());
		int tmp;
		
		for (int i = 0; i < 2; i++) {
			tmp = Integer.parseInt(reader.readLine());
			if (burgerMin > tmp) {
				burgerMin = tmp;
			}
		}
		
		int beverageMin = Integer.parseInt(reader.readLine());
		tmp = Integer.parseInt(reader.readLine());
		if (beverageMin > tmp) {
			beverageMin = tmp;
		}
		
		writer.write(Integer.toString(burgerMin + beverageMin - 50));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
