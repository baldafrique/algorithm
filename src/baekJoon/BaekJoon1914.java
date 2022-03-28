package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon1914 {
	BufferedWriter writer;
	
	public BaekJoon1914() {
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	private void move(int n, int i, int j) throws IOException {
		if (n == 1) {
			writer.write((i + 1) + " " + (j + 1) + "\n");
			return;
		}
		else {
			int k = 3 - (i + j);
			move(n - 1, i, k);
			writer.write((i + 1) + " " + (j + 1) + "\n");
			move(n - 1, k, j);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BaekJoon1914 main = new BaekJoon1914();
		int N = Integer.parseInt(reader.readLine());
		
		System.out.println(new BigInteger("2").pow(N).subtract(BigInteger.ONE));
		if (N <= 20) {
			main.move(N, 0, 2);
			main.writer.flush();
		}
	}

}
