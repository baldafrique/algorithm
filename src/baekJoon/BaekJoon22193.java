package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon22193 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		reader.readLine();
		BigInteger i = new BigInteger(reader.readLine());
		BigInteger j = new BigInteger(reader.readLine());
		writer.write((i.multiply(j)).toString());
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
