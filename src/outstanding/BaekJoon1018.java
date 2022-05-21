package outstanding;
	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon1018 {
	private static boolean areBothOddOrEven(int x, int y) {
		x++;
		y++;
		return (x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ? true : false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		char[][] board = new char[N][M];
		int min = 64;
		
		for (int i = 0; i < N; i++) {
			board[i] = reader.readLine().toCharArray();
		}
		
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				int wMin = 0;
				int bMin = 0;
				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						if (areBothOddOrEven(k, l) && board[i + k][j + l] != 'W') {
							wMin++;
						}
						else if (!areBothOddOrEven(k, l) && board[i + k][j + l] != 'B') {
							wMin++;
						}
						else if (areBothOddOrEven(k, l) && board[i + k][j + l] != 'B') {
							bMin++;
						}
						else if (!areBothOddOrEven(k, l) && board[i + k][j + l] != 'W') {
							bMin++;
						}
					}
				}
				min = Math.min(min, Math.min(wMin, bMin)); 
			}
		}
		
		writer.write(Integer.toString(min));
		writer.flush();
		reader.close();
		writer.close();
	}

}