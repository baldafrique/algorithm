package baekJoon;
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
		int[] B = new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())};
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] D = new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())};
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] J = new int[]{Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())};
		
		int costB = Math.max(Math.abs(J[0] - B[0]), Math.abs(J[1] - B[1]));
		int costD = Math.abs(J[0] - D[0]) + Math.abs(J[1] - D[1]);
		
		writer.write(costB > costD ? "daisy" : costB < costD ? "bessie" : "tie");
		reader.close();
		writer.close();
	}

}