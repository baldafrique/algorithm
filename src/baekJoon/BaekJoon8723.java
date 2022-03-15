package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon8723 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String[] str = reader.readLine().split(" ");
 		int[] sides = new int[3];
 		sides[0] = Integer.parseInt(str[0]);
 		sides[1] = Integer.parseInt(str[1]); 		
 		sides[2] = Integer.parseInt(str[2]);
 		Arrays.sort(sides);
 		
 		if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
 			writer.write("1");
 		}
 		else if (sides[0] == sides[1] && sides[1] == sides[2]) {
 			writer.write("2");
 		}
 		else {
 			writer.write("0");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
