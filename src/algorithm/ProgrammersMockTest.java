package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammersMockTest {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int[] user1 = {1, 2, 3, 4, 5};
 		int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
 		int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
 		int[] cnt = new int[3];
 		int[] answers = {1, 2, 3, 4, 5};
 		
 		for (int i = 0; i < answers.length; i++) {
 			if (user1[i % user1.length] == answers[i]) {
 				cnt[0]++;
 			}
 			if (user2[i % user2.length] == answers[i]) {
 				cnt[1]++;
 			}
 			if (user3[i % user3.length] == answers[i]) {
 				cnt[2]++;
 			}
 		}
 		
 		int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
 		ArrayList<Integer> list = new ArrayList<>();
 		
 		for (int i = 0; i < 3; i++) {
 			if (cnt[i] == max) {
 				list.add(i + 1);
 			}
 		}
 		
 		int[] result = new int[list.size()]; 
 		
 		for (int i = 0; i < list.size(); i++) {
 			result[i] = list.get(i);
 		}
 		
 		writer.write(Arrays.toString(result));
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
