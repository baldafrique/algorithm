package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11098 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int caseNum = Integer.parseInt(reader.readLine());
		int peopleNum;
		int max = 0;
		String name = null;
		for (int i = 0; i < caseNum; i++) {
			peopleNum = Integer.parseInt(reader.readLine());
			for (int j = 0; j < peopleNum; j++) {
				String[][] str = new String[peopleNum][2];
				str[j] = reader.readLine().split(" ");
				if (max < Integer.parseInt(str[j][0])) {
					max = Integer.parseInt(str[j][0]);
					name = str[j][1];
				}
			}
			writer.write(name + "\n");
			max = 0;
		}
		
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
