package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon22015 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int[] candy = new int[3];
		candy[0] = Integer.parseInt(stringTokenizer.nextToken());
		candy[1] = Integer.parseInt(stringTokenizer.nextToken());
		candy[2] = Integer.parseInt(stringTokenizer.nextToken());
		
		Arrays.sort(candy);
		writer.write(Integer.toString(candy[2] * 2 - (candy[0] + candy[1])));
		reader.close();
		writer.close();
	}
}
