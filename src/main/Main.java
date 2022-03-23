package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	
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
 		
 		//
 		int front, end, mid, val;
 		
 		Loop:
 		for (int i = 0; i < num; i++) {
 			val = Integer.parseInt(str[i]);
 			
 			front = 0;
 			end = arr.length - 1;
 			mid = (front + end) / 2;
 			
 			while (front <= end) {
 				if (arr[mid] > val) {
 					end = mid - 1;
 					mid = (front + end) / 2;
 				}
 				else if (arr[mid] < val) {
 					front = mid + 1;
 					mid = (front + end) / 2;
 				}
 				else {
 					writer.write("1\n");
 					continue Loop;
 				}
 			}
 			writer.write("0\n");
 		}
 		//
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
