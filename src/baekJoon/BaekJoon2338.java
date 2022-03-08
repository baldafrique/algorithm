package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon2338 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger a = new BigInteger(reader.readLine());
		BigInteger b = new BigInteger(reader.readLine());
		writer.write(a.add(b) + "\n" + a.subtract(b) + "\n" + a.multiply(b));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
