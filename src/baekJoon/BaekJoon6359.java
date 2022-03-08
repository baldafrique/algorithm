package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon6359 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		boolean[] jails;
		int room;
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			room = Integer.parseInt(reader.readLine());
			jails = new boolean[room];
			for (int j = 1; j <= room; j++) {
				for (int k = 1; k <= room; k++) {
					if (k % j == 0) {
						jails[k - 1] = !jails[k - 1];
					}
				}
			}
			
			for (boolean b : jails) {
				if (b) {
					cnt++;
				}
			}
			
			writer.write(cnt + "\n");
			
			cnt = 0;
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
