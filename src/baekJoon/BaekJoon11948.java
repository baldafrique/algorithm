package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon11948 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		int[] arr = new int[4];
 		int sum = 0;
 		int history, geography;
 		
 		for (int i = 0; i < arr.length; i++) {
 			arr[i] = Integer.parseInt(reader.readLine());
 			sum += arr[i];
 		}
 		
 		Arrays.sort(arr);
 		sum -= arr[0];
 		
 		history = Integer.parseInt(reader.readLine());
 		geography = Integer.parseInt(reader.readLine());
 		
 		sum += history > geography ? history : geography;
 		
 		writer.write(Integer.toString(sum));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
