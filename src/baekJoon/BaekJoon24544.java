package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon24544 {
	public static class Data {
		int level;
		boolean isRegistered;
		
		Data(int level, boolean isRegistered) {
			this.level = level;
			this.isRegistered = isRegistered;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		int entireSum = 0;
		int nonregisteredSum = 0;
		StringTokenizer levels = new StringTokenizer(reader.readLine());
		StringTokenizer statuses = new StringTokenizer(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			int level = Integer.parseInt(levels.nextToken());
			entireSum += level;
			if (statuses.nextToken().equals("0")) {
				nonregisteredSum += level;
			}
		}
		
		writer.write(entireSum + "\n" + nonregisteredSum);
		reader.close();
		writer.close();
	}

}