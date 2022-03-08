package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5063 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int caseNum = Integer.parseInt(reader.readLine());
		String[] str;
		int r, e, c;
		
		for (int i = 0; i < caseNum; i++) {
			str = reader.readLine().split(" ");
			r = Integer.parseInt(str[0]);
			e = Integer.parseInt(str[1]);
			c = Integer.parseInt(str[2]);
			if (e - c > r) {
				writer.write("advertise\n");
			}
			else if (e - c < r) {
				writer.write("do not advertise\n");
			}
			else {
				writer.write("does not matter\n");
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
