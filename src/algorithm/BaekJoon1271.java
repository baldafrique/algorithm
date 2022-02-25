package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon1271 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		BigInteger n = new BigInteger(str[0]);
		BigInteger m = new BigInteger(str[1]);
		
		writer.write(n.divide(m) + "\n");
		writer.write(n.remainder(m).toString());
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
