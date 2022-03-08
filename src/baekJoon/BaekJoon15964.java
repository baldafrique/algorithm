package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon15964 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		BigInteger a = new BigInteger(str[0]);
		BigInteger b = new BigInteger(str[1]);
		writer.write(a.add(b).multiply(a.subtract(b)).toString());
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
