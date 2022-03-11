package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon5988 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		int num = Integer.parseInt(reader.readLine());
 		BigInteger value;
 		BigInteger two = new BigInteger("2");
 		
 		for (int i = 0; i < num; i++) {
 			value = new BigInteger(reader.readLine());
 			writer.write((value.remainder(two).toString().equals("0") ? "even" : "odd") + "\n");
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
