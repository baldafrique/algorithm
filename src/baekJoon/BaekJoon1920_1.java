package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon1920_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int num = Integer.parseInt(reader.readLine());
 		int[] arr = new int[num];
 		String[] str = reader.readLine().split(" ");
 		
 		for (int i = 0; i < arr.length; i++) {
 			arr[i] = Integer.parseInt(str[i]);
 		}
 		
 		Arrays.sort(arr);
 		
 		num = Integer.parseInt(reader.readLine());
 		str = reader.readLine().split(" ");
 		
 		for (int i = 0; i < num; i++) {
 			if (Arrays.binarySearch(arr, Integer.parseInt(str[i])) >= 0) {
 				writer.write("1\n"); 				
 			}
 			else {
 				writer.write("0\n");
 			}
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
