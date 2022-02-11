package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5361 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		String[] data;
		double sum = 0;
		
		for (int i = 0; i < num; i++) {
			data = reader.readLine().split(" ");
			sum += Integer.parseInt(data[0]) * 350.34;
			sum += Integer.parseInt(data[1]) * 230.90;
			sum += Integer.parseInt(data[2]) * 190.55;
			sum += Integer.parseInt(data[3]) * 125.30;
			sum += Integer.parseInt(data[4]) * 180.90;
			writer.write("$" + String.format("%.2f", sum) + "\n");
			sum = 0;
		}
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
