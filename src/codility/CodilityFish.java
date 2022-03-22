package codility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class CodilityFish {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int[] A = {4, 3, 2, 1, 5};
 		int[] B = {0, 1, 0, 0, 0};
 		int answer = 0; // 생존한 윗방향 물고기 수
 		Stack<Integer> s = new Stack<>(); // 생존한 아랫방향 물고기
 		
 		// upstream : 이전의 모든 아랫방향 물고기보다 커야 생존
 		// downstream : 이후의 모든 윗방향 물고기보다 커야 생존
 		
 		for (int i = 0; i < A.length; i++) {
 			if (B[i] == 1) { // 아랫방향 물고기만 저장
 				s.push(A[i]);
 			}
 			else { // 윗방향인 경우
 				while (!s.isEmpty()) { // 이전의 아랫방향 물고기가 존재하는 경우 한마리씩 크기 비교
 					if (s.peek() > A[i]) { // 아랫방향 물고기가 더 큰 경우
 						break; // A[i]는 생존할 수 없으므로 다음 물고기를 확인
 					}
 					else { // 윗방향 물고기가 더 큰 경우
 						s.pop(); // 아랫방향 물고기는 생존 불가
 					}
 				}
 				// 아랫방향 물고기가 존재하지 않는 경우 (원래 없었거나, 윗방향 물고기가 모두 잡아먹었거나)
 				if (s.isEmpty()) {
	 				answer++; // 윗방향 물고기는 생존
	 			}
 			}
 		}
 		
 		writer.write(Integer.toString(answer + s.size()));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
