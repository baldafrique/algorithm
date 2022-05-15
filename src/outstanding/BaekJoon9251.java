package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9251 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = reader.readLine();
		String B = reader.readLine();
		int[][] data = new int[1001][1001];
		
		for (int i = 1; i <= A.length(); i++) {
			char a = A.charAt(i - 1);
			
			for (int j = 1; j <= B.length(); j++) {
				char b = B.charAt(j - 1);
				
				if (a == b) {
					data[i][j] = data[i - 1][j - 1] + 1;
				}
				else {
					data[i][j] = Math.max(data[i - 1][j], data[i][j - 1]);
				}
			}
		}
		
		writer.write(Integer.toString(data[A.length()][B.length()]));
		reader.close();
		writer.close();
	}
}