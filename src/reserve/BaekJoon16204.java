package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon16204 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int[] front = new int[N];
		int[] back = new int[N];
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		
		front[0] = M;
		front[1] = N - M;
		back[0] = K;
		back[1] = N - K;
		
		int max = Math.min(front[0], back[0]) + Math.min(front[1], back[1]);
		writer.write(Integer.toString(max));
		reader.close();
		writer.close();
	}
}
