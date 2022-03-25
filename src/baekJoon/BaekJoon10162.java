package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10162 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int T = Integer.parseInt(reader.readLine());
 		int A = 300;
 		int B = 60;
 		int C = 10;
 		
 		if (T % C != 0) {
 			writer.write("-1");
 		}
 		else {
 			writer.write(T / A + " ");
 			T %= A;
 			
 			writer.write(T / B + " ");
 			T %= B;
 			
 			writer.write(T / C + " ");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
