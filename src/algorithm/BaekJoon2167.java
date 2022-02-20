package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BaekJoon2167 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		int row = Integer.parseInt(str[0]);
		int col = Integer.parseInt(str[1]);
		int[][] matrix = new int[row][col];
		int sum = 0;
		int p, q, r, s;
		
		for (int i = 0; i < row; i++) {
			str = reader.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < num; i++) {
			str = reader.readLine().split(" ");
			p = Integer.parseInt(str[0]);
			q = Integer.parseInt(str[1]);
			r = Integer.parseInt(str[2]);
			s = Integer.parseInt(str[3]);
			
			for (int j = p - 1; j <= r - 1; j++) {
				for (int k = q - 1; k <= s - 1; k++) {
					sum += matrix[j][k];
				}
			}
			
			writer.write(sum + "\n");
			sum = 0;
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
