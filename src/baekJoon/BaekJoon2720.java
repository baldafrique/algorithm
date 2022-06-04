package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		String coins = "";
		
		for (int i = 0; i < T; i++) {
			int change = Integer.parseInt(reader.readLine());
			
			if (change >= 25) {
				coins = change / 25 + " ";
				change %= 25;
			}
			else {
				coins = 0 + " ";
			}

			if (change >= 10) {
				coins += change / 10 + " ";
				change %= 10;
			}
			else {
				coins += 0 + " ";
			}
			
			if (change >= 5) {
				coins += change / 5 + " ";
				change %= 5;
			}
			else {
				coins += 0 + " ";
			}
			
			if (change >= 1) {
				coins += change / 1 + " ";
				change %= 1;
			}
			else {
				coins += 0 + " ";
			}
			
			writer.write(coins + "\n");
			coins = "";
		}
		
		
		reader.close();
		writer.close();
	}

}