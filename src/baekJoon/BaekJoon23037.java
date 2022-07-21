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
		String number = reader.readLine();
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += Math.pow(number.charAt(i) - '0', 5);
		}
		
		writer.write(Integer.toString(sum));
		reader.close();
		writer.close();
	}

}