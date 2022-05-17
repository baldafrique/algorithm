package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon24049 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		boolean[][] yard = new boolean[N + 1][M + 1];
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= N; i++) {
			if (stringTokenizer.nextToken().equals("1")) {
				yard[i][0] = true;
			}
		}
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= M; i++) {
			if (stringTokenizer.nextToken().equals("1")) {
				yard[0][i] = true;
			}
		}
		
		// print state of yard
//		for (int i = 0; i <= N; i++) {
//			for (int j = 0; j <= M; j++) {
//				System.out.print(yard[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (yard[i - 1][j] != yard[i][j - 1]) {
					yard[i][j] = true;
				}
			}
		}
		
		writer.write(yard[N][M] ? "1" : "0");
		writer.flush();
		reader.close();
		writer.close();
	}

}