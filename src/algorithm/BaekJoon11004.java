package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = reader.readLine().split(" ");
		String[] num = reader.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < Integer.parseInt(line[0]); i++) {
			list.add(Integer.parseInt(num[i]));
		}
		Collections.sort(list);
		writer.write(Integer.toString(list.get(Integer.parseInt(line[1]) - 1)));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
