package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon18411 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int[] scores = new int[3];
		
		for (int i = 0; i < 3; i++) {
			scores[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		Arrays.sort(scores);
		writer.write(Integer.toString(scores[1] + scores[2]));
		writer.flush();
		reader.close();
		writer.close();
	}

}
