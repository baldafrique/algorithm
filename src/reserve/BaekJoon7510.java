package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon7510 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int[] sides = new int[3];
			for (int j = 0; j < 3; j++) {
				sides[j] = Integer.parseInt(stringTokenizer.nextToken());
			}
			Arrays.sort(sides);
			boolean isRightTriangle = (Math.pow(sides[2], 2) == Math.pow(sides[0], 2) + Math.pow(sides[1], 2) ? true : false);
			writer.write("Scenario #" + i + ":\n" + isRightTriangle + "\n\n");
		}
		
		
		reader.close();
		writer.close();
	}

}