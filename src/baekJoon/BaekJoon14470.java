package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14470 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		int C = Integer.parseInt(reader.readLine());
		int D = Integer.parseInt(reader.readLine());
		int E = Integer.parseInt(reader.readLine());
		int second = 0;
		
		if (A < 0) {
			second += C * Math.abs(A) + D;
			A = 0;
		}
		second += (B - A) * E;
		
		writer.write(Integer.toString(second));
		reader.close();
		writer.close();
	}
}
