package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		reader.readLine();
		String[] values = reader.readLine().split(" ");
		int target = Integer.parseInt(reader.readLine());
		int cnt = 0;
		
		for (String s : values) {
			if (s.equals(Integer.toString(target))) {
				cnt++;
			}
		}
		
		writer.write(Integer.toString(cnt));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
