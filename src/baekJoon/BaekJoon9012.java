// Unsolved

package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon9012 {
	
	public static ArrayList<String> explore (ArrayList<String> list) {
		Loop:
		for (int i = 0; i <list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (!list.get(i).equals(list.get(j))) {
					list.remove(j);
					list.remove(i);
					break Loop;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		ArrayList<String> list = new ArrayList<>();
		String[] state;
		
		for (int i = 0; i < num; i++) {
			state = reader.readLine().split("");
			for (String s : state) {
				list.add(s);
			}
			for (int j = 0; j < state.length / 2; j++) {
				list = explore(list);
			}
			writer.write(list.size() == 0 ? "Y\n" : "N\n");
			
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
