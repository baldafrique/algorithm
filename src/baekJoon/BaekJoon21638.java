package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon21638 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int t1 = Integer.parseInt(stringTokenizer.nextToken());
		int v1 = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(reader.readLine());
		int t2 = Integer.parseInt(stringTokenizer.nextToken());
		int v2 = Integer.parseInt(stringTokenizer.nextToken());
		
		if (t2 < 0 && v2 >= 10) {
			writer.write("A storm warning for tomorrow! Be careful and stay home if possible!");
		}
		else if (t2 < t1) {
			writer.write("MCHS warns! Low temperature is expected tomorrow.");
		}
		else if (v2 > v1) {
			writer.write("MCHS warns! Strong wind is expected tomorrow.");
		}
		else {
			writer.write("No message");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
