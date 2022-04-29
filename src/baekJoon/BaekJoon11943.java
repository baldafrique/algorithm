package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon11943 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(reader.readLine());
		int C = Integer.parseInt(stringTokenizer.nextToken());
		int D = Integer.parseInt(stringTokenizer.nextToken());
		
		int countA = A + D;
		int countB = B + C;
		
		writer.write(countA < countB ? Integer.toString(countA) : Integer.toString(countB));
		writer.flush();
		reader.close();
		writer.close();
	}
}
