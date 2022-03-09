package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String str = reader.readLine();
 		int n = Integer.parseInt(str.split(" ")[0]);
 		int k = Integer.parseInt(str.split(" ")[1]);
 		int cnt = 0;
 		
 		for (int i = 1; i <= n; i++) {
 			if (n % i == 0) {
 				cnt++;
 			}
 			if (cnt == k) {
 				writer.write(Integer.toString(i));
 				writer.flush();
 				return;
	 		}
 		}
 		writer.write('0');
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
