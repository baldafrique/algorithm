package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon13580 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int[] numbers = new int[3];
		
		for (int i = 0; i < 3; i++) {
			numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(numbers);
		
		if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
			writer.write("S");
		}
		else if (numbers[0] + numbers[1] == numbers[2]) {
			writer.write("S");
		}
		else {
			writer.write("N");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}