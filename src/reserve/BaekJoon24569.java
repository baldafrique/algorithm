package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24569 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean isGoldTeam = true;
		int count = 0;
		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < N; i++) {
			if (5 * Integer.parseInt(reader.readLine()) - 3 * Integer.parseInt(reader.readLine()) > 40) {
				count++;
			}
			else {
				isGoldTeam = false;
			}
		}
		
		writer.write(count + (isGoldTeam ? "+" : ""));
		reader.close();
		writer.close();
	}

}