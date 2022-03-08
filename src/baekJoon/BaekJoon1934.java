package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		String[] data;
		int num1, num2, num3 = 0;
		
		for (int i = 0; i < num; i++) {
			data = reader.readLine().split(" ");
			num1 = Integer.parseInt(data[0]);
			num2 = Integer.parseInt(data[1]);
			for (int j = 1; j <= num2; j++) {
				if (num1 * j % num2 == 0) {
					num3 = num1 * j;
					break;
				}
			}
			writer.write(num3 + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
