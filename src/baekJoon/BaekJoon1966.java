package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stringTokenizer;
			stringTokenizer = new StringTokenizer(reader.readLine());
			@SuppressWarnings("unused")
			int N = Integer.parseInt(stringTokenizer.nextToken());
			int M = Integer.parseInt(stringTokenizer.nextToken());
			stringTokenizer = new StringTokenizer(reader.readLine());
			int cnt = 0;
			
			Queue<Integer> queue = new LinkedList<>(); 
			while (stringTokenizer.hasMoreTokens()) {
				queue.add(Integer.parseInt(stringTokenizer.nextToken()));
			}
			
			while (queue.peek() != null) {
				if (M == 0) {
					if (queue.peek() >= Collections.max(queue)) {
						writer.write(++cnt + "\n");
						break;
					}
					else {
						queue.add(queue.poll());
						M = queue.size() - 1;
					}
				}
				else {
					if (queue.peek() >= Collections.max(queue)) {
						queue.poll();
						cnt++;
					}
					else {
						queue.add(queue.poll());
					}
					M--;
				}
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
