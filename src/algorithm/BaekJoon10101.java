package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10101 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] angles = new int[3];
		int sum = 0;
		
		for (int i = 0; i < angles.length; i++) {
			angles[i] = Integer.parseInt(reader.readLine());
			sum += angles[i];
		}
		
		if (sum == 180) {
			if (angles[0] == angles[1] && angles[1] == angles[2]) {
				writer.write("Equilateral");
			}
			else if (angles[0] != angles[1] && angles[0] != angles[2] && angles[1] != angles[2]) {
				writer.write("Scalene");
			}
			else {
				writer.write("Isosceles");
			}
		}
		else {
			writer.write("Error");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
