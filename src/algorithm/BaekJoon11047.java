package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str.split(" ")[0]);
		int price = Integer.parseInt(str.split(" ")[1]);
		int coin = 0;
		int[] coins = new int[num];
		
		for (int i = 0; i < num; i++) {
			coins[i] = Integer.parseInt(reader.readLine());
		}
		
		for (int i = num - 1; i >= 0; i--) {
			if (price >= coins[i]) {
				coin += price / coins[i];
				price %= coins[i];
			}
		}
		
		writer.write(Integer.toString(coin));
		writer.flush();
		reader.close();
		writer.close();
	}

}
