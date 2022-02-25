package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon24309 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger a = new BigInteger(reader.readLine());
		BigInteger b = new BigInteger(reader.readLine());
		BigInteger c = new BigInteger(reader.readLine());
		writer.write(b.subtract(c).divide(a).toString());
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
