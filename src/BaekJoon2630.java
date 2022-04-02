import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2630 {
	private static int white = 0;
	private static int blue = 0;
	private static int[][] matrix;
	
	private static void recursion(int row, int col, int size) {
		boolean flag = true;
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (matrix[i][j] != matrix[row][col]) {
					flag = false;
				}
			}
		}
		
		if (flag) {
			if (matrix[row][col] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
		}
		else {
			recursion(row, col, size / 2);
			recursion(row, col + size / 2, size / 2);
			recursion(row + size / 2, col, size / 2);
			recursion(row + size / 2, col + size / 2, size / 2);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		matrix = new int[N][N];
		String line;
		
		for (int i = 0; i < N; i++) {
			line = reader.readLine();
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
			}
		}
		
		recursion(0, 0, N);
		writer.write(white + "\n" + blue);
		writer.flush();
		reader.close();
		writer.close();
	}

}
