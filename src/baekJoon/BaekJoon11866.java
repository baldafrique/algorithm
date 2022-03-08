package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon11866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		int gap = Integer.parseInt(str[1]) - 1;
		int idx = 0;
		
		for (int i = 0; i < Integer.parseInt(str[0]); i++) {
			list.add(i + 1);
		}
		
		writer.write("<");
		while (list.size() > 0) {
			idx += gap;
			while (idx >= list.size() && list.size() != 0) {
				idx %= list.size();
			}
			writer.write(list.get(idx) + (list.size() == 1 ? "" : ", "));
			list.remove(idx);
			
		}
		
		writer.write(">");
		writer.flush();
		reader.close();
		writer.close();
	}

}
