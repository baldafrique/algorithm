package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2460 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int peopleNum = 0;
		int peopleMax = 0;
		String[] str;
		
		for (int i = 0; i < 10; i++) {
			str = reader.readLine().split(" ");
			peopleNum -= Integer.parseInt(str[0]);
			peopleNum += Integer.parseInt(str[1]);
			if (peopleNum > peopleMax) {
				peopleMax = peopleNum;
			}
		}
		writer.write(Integer.toString(peopleMax));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
