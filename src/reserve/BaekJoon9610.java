package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon9610 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		int[] Q = new int[4];
		int AXIS = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int X = Integer.parseInt(stringTokenizer.nextToken());
			int Y = Integer.parseInt(stringTokenizer.nextToken());
			
			if (X == 0 || Y == 0) {
				AXIS++;
			}
			else if (X > 0 && Y > 0) {
				Q[0]++;
			}
			else if (X < 0 && Y > 0) {
				Q[1]++;
			}
			else if (X < 0 && Y < 0) {
				Q[2]++;
			}
			else {
				Q[3]++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			writer.write("Q" + (i + 1) + ": " + Q[i] + "\n");
		}
		writer.write("AXIS: " + AXIS);
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
