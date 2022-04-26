package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1075 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String number = reader.readLine();
		String minimumNumber = number.substring(0, number.length() - 2) + "00";
		int start = Integer.parseInt(minimumNumber); 
		int N = Integer.parseInt(number);
		int F = Integer.parseInt(reader.readLine());
		
		while (start % F != 0) {
			start++;
		}
		System.out.printf("%02d", start % 100);
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
