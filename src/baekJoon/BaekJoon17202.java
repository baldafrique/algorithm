package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17202 {
	
	private static String calculate(String number) {
		if (number.length() == 2) {
			return number;
		}
		else {
			String result = "";
			for (int i = 0; i < number.length() - 1; i++) {
				result += (number.charAt(i) + number.charAt(i + 1) - 96) % 10;
			}
			return calculate(result);
		}
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = bufferedReader.readLine();
		String B = bufferedReader.readLine();
		String C = "";
		
		for (int i = 0; i < 8; i++) {
			C += A.charAt(i) + "" + B.charAt(i);
		}
		
		bufferedWriter.write(calculate(C));
		bufferedWriter.flush();
		bufferedReader.close();
		bufferedWriter.close();
	}

}