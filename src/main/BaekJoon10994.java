package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10994 {
	
	private static void print(char[][] arr, int side) {
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void recursion(char[][] arr, int side, int idx, int N) {
//		print(arr, 4 * N - 3);
//		System.out.println("=======================");
		
		if (idx / 2 + 1 == N) {
			arr[idx][idx] = '*';
		}
		else {
			for (int i = idx; i < side - idx; i++) {
	 			for (int j = idx; j < side - idx; j++) {
	 				if (i == idx || j == idx || i == (side - 1) - idx || j == (side - 1) - idx) {
	 					arr[i][j] = '*';
	 				}
	 			}
	 		}
			idx += 2;
			recursion(arr, side, idx, N);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		int N = Integer.parseInt(reader.readLine());
 		int side = 4 * N - 3;  
 		char[][] arr = new char[side][side];
 		
 		for (int i = 0; i < side; i++) {
 			for (int j = 0; j < side; j++) {
 				arr[i][j] = ' ';
 			}
 		}
 		
 		recursion(arr, side, 0, N);
 		print(arr, side);
		reader.close();
	}

}
