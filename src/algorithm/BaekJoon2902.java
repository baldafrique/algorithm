package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2902 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] names = reader.readLine().split("-");
		
		for (int i = 0; i < names.length; i++) {
			writer.write(names[i].charAt(0));
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
