package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14649 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		double property = Double.parseDouble(reader.readLine());
		int N = Integer.parseInt(reader.readLine());
		int[][] secretaries = new int[N][2];
		int[] stones = new int[100];		
		int blue = 0;
		int red = 0;
		int green = 0;
		
		
		for (int i = 0; i < 100; i++) {
			stones[i] = 0;
		}
		
		for (int i = 0; i < N; i++) {
			String temp = reader.readLine();
			secretaries[i][0] = Integer.parseInt(temp.split(" ")[0]) - 1;
			secretaries[i][1] = temp.split(" ")[1].equals("L") ? 0 : 1; 
		}
		
		for (int i = 0; i < N; i++) {
			if (secretaries[i][1] == 0) {
				for (int j = secretaries[i][0] - 1; j >= 0; j--) {
					stones[j] = (stones[j] + 1) % 3;
				}
			}
			else {
				for (int j = secretaries[i][0] + 1; j < 100; j++) {
					stones[j] = (stones[j] + 1) % 3;
				}
			}
		}
		
		for (int stone : stones) {
			if (stone == 0) {
				blue++;
			}
			else if (stone == 1) {
				red++;
			}
			else {
				green++;
			}
		}
		
		System.out.printf("%.2f\n", property * blue / 100);
		System.out.printf("%.2f\n", property * red / 100);
		System.out.printf("%.2f\n", property * green / 100);
		reader.close();
		writer.close();
	}

}