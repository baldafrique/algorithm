package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] board = new String[8][8];
		int chessman = 0;
		
		for (int i = 0; i < 8; i++) {
			board[i] = reader.readLine().split("");
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j].equals("F") && ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0))) {
					chessman++;
				}
			}
		}
		
		writer.write(Integer.toString(chessman));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
