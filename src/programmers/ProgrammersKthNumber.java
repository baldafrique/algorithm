package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ProgrammersKthNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		int[] array = {1, 5, 2, 6, 3, 7, 4};
 		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
 		int[] answer = new int[commands.length];
 		int[] tmp = new int[array.length];
  		
 		for (int i = 0; i < commands.length; i++) {
 			tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
 			Arrays.sort(tmp);
 			answer[i] = tmp[commands[i][2] - 1];
 		}
 		
 		writer.write(Arrays.toString(answer));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
