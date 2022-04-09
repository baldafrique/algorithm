import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProgrammersTheBiggestNumber {
	static void swap(String[] a, int idx1, int idx2) {
		String t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static String solution(int[] numbers) {
		String answer = "";
		String[] str = new String[numbers.length];
		int size = numbers.length;
		boolean allZero = true;
		
		for (int i = 0; i < size; i++) {
			str[i] = Integer.toString(numbers[i]);
			if (numbers[i] != 0) {
				allZero = false;
			}
		}
		
		if (allZero) {
			answer = "0";
		}
		else {
			for (int i = 0; i < size - 1; i++) {
				for (int j = size - 1; j > i; j--) {
					if (Integer.parseInt(str[j - 1] + str[j]) < Integer.parseInt(str[j] + str[j - 1])) {
						swap(str, j - 1, j);
					}
				}
			}
			
			for (String s : str) {
				answer += s;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		writer.write(solution(new int[] {3, 30, 34, 5, 9}));
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
