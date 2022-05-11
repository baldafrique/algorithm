
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon13229 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		String str = reader.readLine();
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		int m = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < m; i++) {
			str = reader.readLine();
			int start = Integer.parseInt(str.split(" ")[0]);
			int end = Integer.parseInt(str.split(" ")[1]);
			int sum = 0;
			
			for (int j = start; j <= end; j++) {
				sum += arr[j];
			}
			writer.write(sum + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
