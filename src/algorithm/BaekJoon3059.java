package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon3059 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		String str;
		int sum;
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < num; i++) {
			sum = 2015;
			str = reader.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (!set.contains(str.charAt(j))) {
					set.add(str.charAt(j));
					sum -= str.charAt(j);
				}
			}
			writer.write(sum + "\n");
			set = new HashSet<>();
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
