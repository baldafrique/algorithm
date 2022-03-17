package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon11723 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(reader.readLine());
		Set<String> s = new HashSet<>();
		String[] line;
		for (int i = 0; i < num; i++) {
			line = reader.readLine().split(" ");
			switch (line[0]) {
			case "add":
				s.add(line[1]);
				break;
			case "remove":
				s.remove(line[1]);
				break;
			case "check":
				writer.write((s.contains(line[1]) ? "1" : "0") + "\n");
				break;
			case "toggle":
				if (s.contains(line[1])) {
					s.remove(line[1]);
				}
				else {
					s.add(line[1]);
				}
				break;
			case "all":
				s = new HashSet<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"));
				break;
			case "empty":
				s.clear();
				break;
			default:
				break;
			}
		}
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
