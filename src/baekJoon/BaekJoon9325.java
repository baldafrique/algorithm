package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9325 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(reader.readLine());
		int s, n, sum;
		String str;
		
		for (int i = 0; i < num; i++) {
			s = Integer.parseInt(reader.readLine());
			n = Integer.parseInt(reader.readLine());
			sum = s;
			for (int j = 0; j < n; j++) {
				str = reader.readLine();
				sum += Integer.parseInt(str.split(" ")[0]) * Integer.parseInt(str.split(" ")[1]);
			}
			writer.write(sum + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
