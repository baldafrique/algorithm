package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(reader.readLine());
		ArrayList<Integer> data = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			data.add(Integer.parseInt(reader.readLine()));
		}
		Collections.sort(data);
		for (Integer integer : data) {
			writer.write(integer + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
		

	}

}
