package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24183 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = reader.readLine().split(" ");
		int c4 = Integer.parseInt(str[0]);
		int a3 = Integer.parseInt(str[1]);
		int a4 = Integer.parseInt(str[2]);
		double sum = 0;
		
		sum += 229 * 324 * c4 * 2;
		sum += 297 * 420 * a3 * 2;
		sum += 210 * 297 * a4;
		sum *= 0.000001;
		
		writer.write(Double.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}

}
