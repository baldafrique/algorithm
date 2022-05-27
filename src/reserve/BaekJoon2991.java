package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2991 {
	private static int visit(int A, int B, int C, int D, int X) {
		int attacked = 0;
		if (X % (A + B) > 0 && X % (A + B) <= A) {
			attacked++;
		}
		if (X % (A + B) > 0 && X % (C + D) <= C) {
			attacked++;
		}
		return attacked;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int C = Integer.parseInt(stringTokenizer.nextToken());
		int D = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int P = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		
		writer.write(visit(A, B, C, D, P) + "\n");
		writer.write(visit(A, B, C, D, M) + "\n");
		writer.write(visit(A, B, C, D, N) + "\n");
		
		reader.close();
		writer.close();
	}

}