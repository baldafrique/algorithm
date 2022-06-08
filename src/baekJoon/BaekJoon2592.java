package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2592 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numbers = new int[10];
		int average = 0;
		int[] mode = new int[2];
		int count = 0;
		int temp;
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
			average += numbers[i];
		}
		
		average /= 10;
		Arrays.sort(numbers);
		mode[0] = numbers[0];
		mode[1] = 0;
		
		temp = numbers[0];
		for (int i = 0; i < 10; i++) {
			if (i == 9 || numbers[i] != temp) {
				if (mode[1] < count) {
					mode[0] = temp;
					mode[1] = count;
					temp = numbers[i];
				}
				temp = numbers[i];
				count = 0;
			}
			else {
				count++;
			}
		}
		
		writer.write(average + "\n" + mode[0]);
		reader.close();
		writer.close();
	}

}