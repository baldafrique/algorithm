package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2738 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		int row = Integer.parseInt(str[0]);
		int col = Integer.parseInt(str[1]);
		int[][][] mat = new int[2][row][col];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < row; j++) {
				str = reader.readLine().split(" ");
				for (int k = 0; k < col; k++) {
					mat[i][j][k] = Integer.parseInt(str[k]);
				}
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				writer.write(mat[0][i][j] + mat[1][i][j] + " ");
			}
			writer.write("\n");
		}
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
