package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersFunctionDevelopment {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

// 		int[] progresses = {95, 90, 99, 99, 80, 99};
// 		int[] speed = {1, 1, 1, 1, 1, 1};
// 		int[] progresses = {93, 30, 55};
// 		int[] speed = {1, 30, 5};
 		int[] progresses = {5, 5, 5};
 		int[] speed = {21, 25, 20};
 		
 		int[] arr = new int[progresses.length];
 		int idx = 0;
 		Queue<Integer> queue = new LinkedList<>();
 		
 		for (int i = 0; i < progresses.length; i++) {
 			// 작업 진도와 작업 속도를 통해 개발하는데 소요되는 날짜 계산
 			queue.add((int) Math.ceil((100 - progresses[i]) / (double) speed[i]));
 		}
 		
 		while (queue.size() != 0) { // 개발할 기능이 남은 경우
 			int front = queue.poll();
 	 		int cnt = 1; // 1개를 poll() 하였으므로 최소 1개의 기능이 배포됨
 	 		while (queue.size() != 0 && front >= queue.peek()) {
 	 			// 개발할 기능이 남았고 && front보다 빨리 완성된 기능이 있는 경우
 	 			queue.poll(); // 함께 배포
 	 			cnt++; // 배포한 기능의 수
 	 		}
 	 		arr[idx++] = cnt;
 		}
 		
 		writer.write(Arrays.toString(Arrays.copyOfRange(arr, 0, idx)));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
