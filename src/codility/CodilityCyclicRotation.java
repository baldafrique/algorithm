package codility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CodilityCyclicRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int[] A = {3, 8, 9, 7, 6};
 		int K = 3;
 		
 		if (A.length == 0) {
 			A = new int[0];
 		}
 		
 		else { 	
 			Deque<Integer> deque = new ArrayDeque<Integer>();
 			for (int i : A) {
				deque.add(i);
			}
 			
 			for (int i = 0; i < K % A.length; i++) {
 				deque.addFirst(deque.pollLast());
 	 		}
 			
 			for (int i = 0; i < A.length; i++) {
 				A[i] = deque.pollFirst();
 			}
 		}
 		
 		writer.write(Arrays.toString(A));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
