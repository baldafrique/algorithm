package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon15726 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken()); 
		double B = Double.parseDouble(stringTokenizer.nextToken());
		double C = Double.parseDouble(stringTokenizer.nextToken());

		writer.write(Integer.toString((int) (B > C ? A * B / C : A / B * C)));
		reader.close();
		writer.close();
	}
}
