package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersPrinter {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int[] priorities = {2, 1, 3, 2};
 		int location = 3;
// 		int[] priorities = {1, 1, 9, 1, 1, 1};
// 		int location = 0;
 		int answer = 0;
 		Queue<Integer> q = new LinkedList<>();
 		
 		for (int i = 0; i < priorities.length; i++) {
 			q.add(priorities[i]);
 		}
 		
 		while (q.size() > 0) {
 			if (location == 0) { // 내가 인쇄 요청한 문서의 차례
 	 			if (q.peek() < Collections.max(q)) { // 내가 인쇄 요청한 문서보다 중요한 문서가 뒤에 있는 경우 
 	 				q.add(q.poll()); // 해당 문서를 대기목록의 가장 마지막으로 보냄
 	 				location = q.size() - 1;
 	 			}
 	 			else { // 내가 인쇄 요청한 문서가 가장 중요한 경우 
 	 				answer++;
 	 				break;
 	 			}
 	 		}
 	 		else { // 내가 인쇄 요청한 문서가 아닌 다른 문서의 차례
 	 			if (q.peek() < Collections.max(q)) { // 해당 문서보다 중요한 문서가 뒤에 있는 경우
 	 				q.add(q.poll()); // 해당 문서를 대기목록의 가장 마지막으로 보냄
 	 			}
 	 			else { // 해당 문서가 가장 중요한 경우
 	 				q.poll(); // 해당 문서를 출력
 	 				answer++;
 	 			} // 위의 두 경우 모두 location이 1 감소
 	 			location--;
 	 		}
 		}
 		
 		writer.write(Integer.toString(answer));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
