package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon1297 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int D = Integer.parseInt(stringTokenizer.nextToken());
		int H = Integer.parseInt(stringTokenizer.nextToken());
		int W = Integer.parseInt(stringTokenizer.nextToken());
		
		double K = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));
		H = (int) (H * K);
		W = (int) (W * K);
		
		writer.write(H + " " + W);
		reader.close();
		writer.close();
	}
}
