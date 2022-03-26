package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon1920_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int N = Integer.parseInt(reader.readLine());
 		int[] A = new int[N];
 		String[] str = reader.readLine().split(" ");
 		
 		for (int i = 0; i < N; i++) {
 			A[i] = Integer.parseInt(str[i]);
 		}
 		
 		Arrays.sort(A);
 		int M = Integer.parseInt(reader.readLine());
 		str = reader.readLine().split(" ");
 		
 		int front, end, mid, val;
 		
 		Loop:
 		for (int i = 0; i < M; i++) {
 			val = Integer.parseInt(str[i]);
 			front = 0;
 			end = N - 1;
 			mid = (front + end) / 2;
 			while (front <= end) {
 				if (mid < front || mid > end) {
 					continue Loop;
 				}
 				if (A[mid] > val) {
 					end = mid - 1;
 					mid = (front + end) / 2;
 				}
 				else if (A[mid] < val) {
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
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
