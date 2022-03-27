package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class BaekJoon10816 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		HashMap<Integer, Integer> m = new HashMap<>();
		int[] cards = new int[N];
		String[] s = reader.readLine().split(" ");
		
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(s[i]);
		}
		
		for (int i = 0; i < N; i++) {
			if (m.containsKey(cards[i])) {
				m.put(cards[i], m.get(cards[i]) + 1);
			}
			else {
				m.put(cards[i], 1);				
			}
		}

		int M = Integer.parseInt(reader.readLine());
		s = reader.readLine().split(" ");
		
		for (int i = 0; i < M; i++) {
			writer.write((m.get(Integer.parseInt(s[i])) == null ? 0 : m.get(Integer.parseInt(s[i]))) + " ");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
	
}