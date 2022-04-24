package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18221 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		char[][] arr = new char[N][N];
		int proX = 0;
		int proY = 0;
		int stuX = 0;
		int stuY = 0; 
		boolean escapable = true;
		
		for (int i = 0; i < N; i++) {
			String tmp = reader.readLine().replace(" ", "");
			if (tmp.contains("5")) {
				for (int j = 0; j < N; j++) {
					if (tmp.charAt(j) == '5') {
						proX = i;
						proY = j;
					}
				}
			}
			else if (tmp.contains("2")) {
				for (int j = 0; j < N; j++) {
					if (tmp.charAt(j) == '2') {
						stuX = i;
						stuY = j;
					}
				}
			}
			arr[i] = tmp.toCharArray();
		}
		
		if (Math.sqrt(Math.pow(proX - stuX, 2) + Math.pow(proY - stuY, 2)) < 5) {
			escapable = false;
		}
		
		if (escapable) {
			int minX = Math.min(proX, stuX);
			int maxX = Math.max(proX, stuX);
			int minY = Math.min(proY, stuY);
			int maxY = Math.max(proY, stuY);
			int cnt = 0;
			
			for (int i = minX; i <= maxX; i++) {
				for (int j = minY; j <= maxY; j++) {
					if (arr[i][j] == '1') {
						cnt++;
					}
				}
			}
			
			if (cnt < 3) {
				escapable = false;
			}
		}
		
		writer.write(escapable ? "1" : "0");
		writer.flush();
		reader.close();
		writer.close();
	}
}
