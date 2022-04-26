import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private enum EDirections {
		eRight,
		eDown,
		eLeft,
		eUp;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		boolean[][] matrix = new boolean[M][N];
		EDirections direction = EDirections.eRight;
		int row = 0;
		int column = 0;
		int turn = 0;
		
		matrix[row][column] = true;
		while (true) {
			for (int i = 0; i < M; i++) {
				System.out.println(Arrays.toString(matrix[i]));
			}
			System.out.println("============================");
			if (direction == EDirections.eRight) {
				if (column + 1 <= N - 1) {
					if (matrix[row][column + 1] == false) {
						matrix[row][++column] = true;	
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eDown;
						turn++;
					}
					else if (matrix[row][column - 1] != true) {
						direction = EDirections.eLeft;
						turn++;
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eUp;
						turn++;
					}
					else {
						break;
					}
				}
				else {
					direction = EDirections.eDown;
					turn++;
				}
			}
			else if (direction == EDirections.eDown) {
				if (row + 1 <= M - 1) {
					if (matrix[row + 1][column] == false) {
						matrix[++row][column] = true;	
					}
					else if (matrix[row][column - 1] != true) {
						direction = EDirections.eLeft;
						turn++;
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eUp;
						turn++;
					}
					else if (matrix[row][column + 1] != true) {
						direction = EDirections.eRight;
						turn++;
					}
					else {
						break;
					}
				}
				else {
					direction = EDirections.eLeft;
					turn++;
				}
			}
			else if (direction == EDirections.eLeft) {
				if (column - 1 >= 0) {
					if (matrix[row][column - 1] == false) {
						matrix[row][--column] = true;	
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eUp;
						turn++;
					}
					else if (matrix[row][column + 1] != true) {
						direction = EDirections.eRight;
						turn++;
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eDown;
						turn++;
					}
					else {
						break;
					}
				}
				else {
					direction = EDirections.eUp;
					turn++;
				}
			}
			else {
				if (row - 1 >= 0) {
					if (matrix[row - 1][column] == false) {
						matrix[--row][column] = true;	
					}
					else if (matrix[row][column + 1] != true) {
						direction = EDirections.eRight;
						turn++;
					}
					else if (matrix[row + 1][column] != true) {
						direction = EDirections.eDown;
						turn++;
					}
					else if (matrix[row][column - 1] != true) {
						direction = EDirections.eLeft;
						turn++;
					}
					else {
						break;
					}
				}
				else {
					direction = EDirections.eRight;
					turn++;
				}
			}
		}
		
		writer.write(Integer.toString(turn));
		writer.flush();
		reader.close();
		writer.close();
	}
}
