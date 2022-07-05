package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon23037 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(reader.readLine());
		long sum = 0;
		long quotient = 10;
		
		for (int i = 0; i < 5; i++) {
			long remainder = n % quotient; 
			sum += Math.pow(remainder, 5);
			n /= 10;
		}
		
		writer.write(String.valueOf(sum));
		writer.flush();
		reader.close();
		writer.close();
	}

}
