package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		String[][] str = new String[9][9];
 		int max = 0;
 		int row = 0;
 		int col = 0;
 		for (int i = 0; i < 9; i++) {
 			str[i] = reader.readLine().split(" ");
 			for (int j = 0; j < 9; j++) {
 				if (Integer.parseInt(str[i][j]) >= max) {
 					max = Integer.parseInt(str[i][j]);
 					row = i + 1;
 					col = j + 1;
 				}
 			}
 		}
 		writer.write(max + "\n" + row + " " + col);
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
