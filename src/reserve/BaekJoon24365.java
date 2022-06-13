package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon24365 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int C = Integer.parseInt(stringTokenizer.nextToken());
		int mean = (A + B + C) / 3;
		int cost = 0;
		
		if (B < mean) {
			cost = (mean - B) + (mean - A) * 2;
		}
		else if (B > mean) {
			cost = (B - mean) + (C - mean) * 2;
		}
		else {
			cost = (C - mean) * 2;
		}
		
		writer.write(Integer.toString(cost));
		writer.flush();
		reader.close();
		writer.close();
	}

}
