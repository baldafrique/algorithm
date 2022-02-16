package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				writer.write(i + "\n");
			}
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
