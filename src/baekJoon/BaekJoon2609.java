package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int i = 1; 
		String[] data = reader.readLine().split(" ");
		int x = Integer.parseInt(data[0]);
		int y = Integer.parseInt(data[1]);
		int lcm = 0; // least common multiple(최소공배수)
		int gcd = 0; // greatest common divisor(최대공약수)
		
		while (i <= (x > y ? y : x)) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
			}
			i++;
		}
		
		i = 1;
		while (true) {
			if (x * i % y == 0) {
				lcm = x * i;
				break;
			}
			i++;
		}
		
		writer.write(gcd + "\n");
		writer.write(Integer.toString(lcm));
		writer.flush();
		reader.close();
		writer.close();
		

	}

}
