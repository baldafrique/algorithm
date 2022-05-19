package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon16431 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;

		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] B = new int[2];
		B[0] = Integer.parseInt(stringTokenizer.nextToken());
		B[1] = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] D = new int[2];
		D[0] = Integer.parseInt(stringTokenizer.nextToken());
		D[1] = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] J = new int[2];
		J[0] = Integer.parseInt(stringTokenizer.nextToken());
		J[1] = Integer.parseInt(stringTokenizer.nextToken());
		
		int[] X = new int[2];
		X[0] = Math.max(Math.abs(B[0] - J[0]), Math.abs(B[1] - J[1]));
		X[1] = Math.abs(D[0] - J[0]) + Math.abs(D[1] - J[1]);
		
		writer.write(X[0] + " " + X[1]);
		reader.close();
		writer.close();
	}
}
