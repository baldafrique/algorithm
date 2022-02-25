// Unsolved

package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1236 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str1 = reader.readLine().split(" ");
		String str2;
		int cnt = 0;
		int row = Integer.parseInt(str1[0]);
		int col = Integer.parseInt(str1[1]);
		char[][] mat = new char[row][col];
		
		for (int i = 0; i < row; i++) {
			str2 = reader.readLine();
			for (int j = 0; j < col; j++) {
				mat[i][j] = str2.charAt(j);
			}
		}
		
		
		Loop1:
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 'X') {
					continue Loop1;
				}
			}
			Loop2:
			for (int j = 0; j < col; j++) {
				if (mat[i][j] != 'X') {
					for (int k = 0; k < row; k++) {
						if (mat[k][j] == 'X' && j == col - 1) {
//							mat[i][0] = 'X';
						}
						else if (mat[k][j] == 'X') {							
							continue Loop2;
						}
						else if (k == row - 1 && mat[k][j] != 'X') {
							mat[i][j] = 'X';
							cnt++;
							continue Loop1;
						}
						
					}
				}
			}
		}
		
		for (int l = 0; l < row; l++) {
			for (int m = 0; m < col; m++) {
				writer.write(mat[l][m]);
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
