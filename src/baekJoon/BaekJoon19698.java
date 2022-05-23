package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon19698 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int W = Integer.parseInt(stringTokenizer.nextToken());
		int H = Integer.parseInt(stringTokenizer.nextToken());
		int L = Integer.parseInt(stringTokenizer.nextToken());
		int vacancy = (W / L) * (H / L);
		
		writer.write(Integer.toString(N > vacancy ? vacancy : N));
		reader.close();
		writer.close();
	}

}