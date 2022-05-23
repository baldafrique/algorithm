package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon2997 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int[] numbers = new int[3];
		
		for (int i = 0; i < 3; i++) {
			numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(numbers);
		
		int gap1 = numbers[1] - numbers[0];
		int gap2 = numbers[2] - numbers[1];
		
		if (gap1 == gap2) { // 초항 또는 마지막 항이 없는 경우
			writer.write(Integer.toString(numbers[2] + gap1));
		}
		else if (gap1 > gap2) { // 두번째 항이 없는 경우
			writer.write(Integer.toString(numbers[0] + gap2));
		}
		else { // 세번째 항이 없는 경우
			writer.write(Integer.toString(numbers[1] + gap1));
		}
		
		reader.close();
		writer.close();
	}

}