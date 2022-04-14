package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5218 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] arr = reader.readLine().split(" ");
			writer.write("Distances: ");
			for (int j = 0; j < arr[0].length(); j++) {
				if (arr[0].charAt(j) <= arr[1].charAt(j)) {
					writer.write(arr[1].charAt(j) - arr[0].charAt(j) + " ");
				}
				else if (arr[0].charAt(j) > arr[1].charAt(j)) {
					writer.write(arr[1].charAt(j) + 26 - arr[0].charAt(j) + " ");
 				}
			}
			writer.write("\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
