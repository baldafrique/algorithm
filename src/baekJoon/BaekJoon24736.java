package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24736 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		String[] str;
 		int sum;
 		
 		for (int i = 0; i < 2; i++) {
 			sum = 0;
 			str = reader.readLine().split(" ");
 			sum = Integer.parseInt(str[0]) * 6 + Integer.parseInt(str[1]) * 3 + Integer.parseInt(str[2]) * 2 + Integer.parseInt(str[3]) + Integer.parseInt(str[4]) * 2;
 			writer.write(sum + " ");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
