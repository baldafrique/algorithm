package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon14924 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		
		int S = Integer.parseInt(stringTokenizer.nextToken());
		int T = Integer.parseInt(stringTokenizer.nextToken());
		int D = Integer.parseInt(stringTokenizer.nextToken());
		
		writer.write(Integer.toString(D / (2 * S) * T));
		
		reader.close();
		writer.close();
	}
}
