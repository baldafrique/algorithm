package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon10817 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[3];
		String str = reader.readLine();
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		Arrays.sort(arr);
		writer.write(Integer.toString(arr[1]));
		
		writer.flush();
		reader.close();
		writer.close();
		
	}

}
