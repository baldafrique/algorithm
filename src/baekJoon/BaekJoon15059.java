package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15059 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] quantity = new int[3];
		int[] demand = new int[3];
		String str;
		int cnt = 0;

		str = reader.readLine();
		for (int i = 0; i < 3; i++) {
			quantity[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		str = reader.readLine();
		for (int i = 0; i < 3; i++) {
			demand[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 0; i < 3; i++) {
			if (quantity[i] < demand[i]) {
				cnt += demand[i] - quantity[i];
			}
		}
		
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}

}
