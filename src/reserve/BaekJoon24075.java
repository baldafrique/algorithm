package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon24075 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int max = Math.max(A + B, A - B);
		int min = Math.min(A + B, A - B);
		
		writer.write(max + "\n" + min);
		writer.flush();
		reader.close();
		writer.close();
	}

}