package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon4493 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(reader.readLine());
		Map<Character, Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('S', 1);
		map.put('P', 2);
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(reader.readLine());
			int score1 = 0;
			int score2 = 0;
			for (int j = 0; j < n; j++) {
				String state = reader.readLine();
				int state1 = map.get(state.charAt(0));
				int state2 = map.get(state.charAt(2));
				
				if (state1 == state2) {
					continue;
				}
				else if ((state1 + 1) % 3 == state2) {
					score1++;
				}
				else {
					score2++;
				}
			}
			writer.write((score1 > score2 ? "Player 1" : score1 < score2 ? "Player 2" : "TIE") + "\n");
		}
		
		
		reader.close();
		writer.close();
	}

}