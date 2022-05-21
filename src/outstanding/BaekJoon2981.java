package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2981 {
	public static int gcd(int x, int y) {
		while(y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	} 

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		int[] numbers = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(numbers);
		
		int number = numbers[1] - numbers[0];
		for(int i = 2; i < N; i++) {
			number = gcd(number, numbers[i] - numbers[i - 1]);
		}
		
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				writer.write(i + " ");
			}
		}
		writer.write(Integer.toString(number));
		writer.flush();
		reader.close();
		writer.close();
	}

}