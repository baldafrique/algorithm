package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon13866 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int[] level = new int[4];
		
		for (int i = 0; i < 4; i++) {
			level[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		Arrays.sort(level);
		
		writer.write(Integer.toString(Math.abs(level[0] - level[1] - level[2] + level[3])));
		writer.flush();
		reader.close();
		writer.close();

	}

}
