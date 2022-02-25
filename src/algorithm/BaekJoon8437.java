package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon8437 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger num1 = new BigInteger(reader.readLine());
		BigInteger num2 = new BigInteger(reader.readLine());
		writer.write(num1.add(num2).divide(new BigInteger("2")) + "\n" + num1.subtract(num2).divide(new BigInteger("2")));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
