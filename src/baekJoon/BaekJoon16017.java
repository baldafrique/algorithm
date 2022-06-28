package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16017 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String number = "";
		
		for (int i = 0; i < 4; i++) {
			number += reader.readLine();
		}
		
		writer.write(
				(number.charAt(0) == '8' || number.charAt(0) == '9') && 
				(number.charAt(3) == '8' || number.charAt(3) == '9') && 
				(number.charAt(1) == number.charAt(2)
				) ? "ignore" : "answer");
		reader.close();
		writer.close();
	}

}