package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24510 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(reader.readLine());
		int max = 0;
		
		for (int i = 0; i < C; i++) {
			String temp = reader.readLine().replaceAll("for", "X").replaceAll("while", "X");
			int count = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == 'X') {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		
		writer.write(Integer.toString(max));
		reader.close();
		writer.close();
	}

}