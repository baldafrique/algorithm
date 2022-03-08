package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = reader.readLine().split(" ");
		int index = 0;
		ArrayList<Integer> circle = new ArrayList<>();
		
		for (int i = 0; i < Integer.parseInt(line[0]); i++) {
			circle.add(i + 1);
		}
		writer.write("<");
		
		while (circle.size() > 0) {
			if (index > circle.size()) {
				index %= circle.size();
			}
			writer.write(Integer.toString(circle.get((index + Integer.parseInt(line[1]) - 1) % circle.size())));
			writer.write(circle.size() == 1 ? ">" : ", ");
			index += Integer.parseInt(line[1]) - 1;
			index %= circle.size();
			circle.remove(index);
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
