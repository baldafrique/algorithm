package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon21197 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		boolean isRunning = false;
		int time = 0;
		int[] records = new int[N];
		
		for (int i = 0; i < N; i++) {
			isRunning = !isRunning;
			records[i] = Integer.parseInt(reader.readLine());
			if (!isRunning) {
				time += records[i] - records[i - 1];
			}
		}
		
		writer.write(isRunning ? "still running" : Integer.toString(time));
		reader.close();
		writer.close();
	}
}
