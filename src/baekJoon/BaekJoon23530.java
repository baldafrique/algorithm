package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon23530 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer;
		
		for (int i = 0; i < t; i++) {
			stringTokenizer = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(stringTokenizer.nextToken());
			int b = Integer.parseInt(stringTokenizer.nextToken());
			writer.write(a + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
