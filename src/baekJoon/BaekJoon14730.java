package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon14730 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bufferedReader.readLine());
		int result = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			result += Integer.parseInt(stringTokenizer.nextToken()) * Integer.parseInt(stringTokenizer.nextToken());
		}
		
		bufferedWriter.write(Integer.toString(result));
		bufferedWriter.flush();
		bufferedReader.close();
		bufferedWriter.close();
	}

}