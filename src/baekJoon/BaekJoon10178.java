package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10178 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(reader.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int c = Integer.parseInt(stringTokenizer.nextToken());
			int v = Integer.parseInt(stringTokenizer.nextToken());
			int quotient = c / v;
			int remainder = c % v;
			
			writer.write("You get " + quotient + " piece(s) and your dad gets " + remainder + " piece(s).\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
