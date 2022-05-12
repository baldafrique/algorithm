package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon13136 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		long R = Long.parseLong(stringTokenizer.nextToken());
		long C = Long.parseLong(stringTokenizer.nextToken());
		long N = Long.parseLong(stringTokenizer.nextToken());
		long quotient;
		
		quotient = (R % N == 0 ? R / N : R / N + 1);
		quotient = quotient * (C % N == 0 ? C / N : C / N + 1);
		
		writer.write(Long.toString(quotient));
		reader.close();
		writer.close();
	}
}
