package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		int[] numbers = new int[N];
		int average = 0;
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
			average += numbers[i];
		}
		
		average = (int) Math.round((float) average / N);
		Arrays.sort(numbers);
		int median = numbers[N / 2];
		int range = numbers[N - 1] - numbers[0];
		
		int[] count = new int[N];
		int tempIndex = 0;
		count[tempIndex] = 1;
		int num = 1; // number of elements in count
		
		for (int i = 0; i < N - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				count[tempIndex]++;
			}
			else {
				count[++tempIndex] = 1;
				num++;
			}
		}
		
		int maxCountIndex = 0;
		for (int i = 0; i < N; i++) {
			if (count[maxCountIndex] < count[i]) {
				maxCountIndex = i;
			}
		}
		
		int tempMode = count[maxCountIndex];
		boolean flag = false; 
	
		int maxModeIndex = 0;
		for (int i = 0; i < num; i++) {
			if (flag == true && count[i] == tempMode) {
				maxModeIndex = i;
				break;
			}
			else if (count[i] == tempMode) {
				maxModeIndex = i;
				flag = true;
			}
		}
		
		int maxIndex = 0;
		for (int i = 0; i < maxModeIndex; i++) {
			maxIndex += count[i];
		}

		int mode = numbers[maxIndex];
		
		writer.write(average + "\n" + median + "\n" + mode + "\n" + range);
		writer.flush();
		reader.close();
		writer.close();
	}
}
