package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1855 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(reader.readLine());
		String str = reader.readLine();
		int row = (int) Math.floor((float) str.length() / K);
		char[][] arr = new char[row][K]; 
		int idx = 0;
		String ret = "";
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < K; j++) {
				if (i % 2 == 0) {
					arr[i][j] = str.charAt(idx++);
				}
				else {
					arr[i][(K - 1) - j] = str.charAt(idx++);; 
				}
			}
		}
		
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < row; j++) {
				ret += arr[j][i];
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}
}
