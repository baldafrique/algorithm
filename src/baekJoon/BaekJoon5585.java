package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int money = 1000 - Integer.parseInt(reader.readLine());
		int coins[] = {500, 100, 50, 10, 5, 1};
		int coin = 0;
		
		for (int i : coins) {
			coin += money / i;
			money %= i;
		}
		
		writer.write(Integer.toString(coin));
		writer.flush();
		reader.close();
		writer.close();
	}

}
