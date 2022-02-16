package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		reader.readLine();
		String[] line = reader.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < line.length; i++) {
			list.add(Integer.parseInt(line[i]));
		}
		Collections.sort(list);
		if (list.size() == 1) {
			writer.write(Integer.toString((int)(Math.pow(list.get(0), 2))));
		}
		else {
			writer.write(Integer.toString(list.get(0) * list.get(list.size() - 1)));
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
