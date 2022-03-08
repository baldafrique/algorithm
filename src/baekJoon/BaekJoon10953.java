package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		String[] arr = new String[2];
		
		for (int i = 0; i < num; i++) {
			arr = reader.readLine().split(",");
			writer.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
