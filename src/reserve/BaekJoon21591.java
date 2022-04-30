package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon21591 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int wc = Integer.parseInt(stringTokenizer.nextToken());
		int hc = Integer.parseInt(stringTokenizer.nextToken());
		int ws = Integer.parseInt(stringTokenizer.nextToken());
		int hs = Integer.parseInt(stringTokenizer.nextToken());
		
		if (wc >= ws + 2 && hc >= hs + 2) {
			writer.write('1');
		}
		else {
			writer.write('0');
		}
		
		reader.close();
		writer.close();
	}
}
