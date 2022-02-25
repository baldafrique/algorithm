package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon1246 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		int eggNum = Integer.parseInt(str[0]);
		int cusNum = Integer.parseInt(str[1]);
		int[] priceLim = new int[cusNum]; // 각 손님들이 제시하는 달걀의 최댓값
		int price = 0;
		int profit = 0;
		int priceMax = 0;
		int profitMax = 0;
		
		for (int i = 0; i < cusNum; i++) {
			priceLim[i] = Integer.parseInt(reader.readLine());
		}
		Arrays.sort(priceLim);
		
		for (int i = cusNum - 1; i >= 0; i--) {
			price = priceLim[i];
			if (cusNum - i <= eggNum) {
				profit = (cusNum - i) * price;
				if (profitMax < profit) {
					profitMax = profit;
					priceMax = price;
				}
			}
		}
		
		writer.write(priceMax + " " + profitMax);
		writer.flush();
		reader.close();
		writer.close();
	}

}
