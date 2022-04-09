package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon6763 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int limit = Integer.parseInt(reader.readLine());
		int speed = Integer.parseInt(reader.readLine());
		
		if (speed <= limit) {
			writer.write("Congratulations, you are within the speed limit!");
		}
		else if (speed - limit <= 20) {
			writer.write("You are speeding and your fine is $100.");
		}
		else if (speed - limit <= 30) {
			writer.write("You are speeding and your fine is $270.");	
		}
		else {
			writer.write("You are speeding and your fine is $500.");	
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
