import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon3508 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int min = 100;
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				int num = Integer.parseInt(stringTokenizer.nextToken());
				if (num % 2 == 0) {
					if (num < min) {
						min = num;
					}
					
					sum += num;
				}
			}
			writer.write(sum + " " + min + "\n");
		}
				
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
