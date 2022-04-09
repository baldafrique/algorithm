import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProgrammersHIndex {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}
	
	static int solution(int[] citations) {
		// 0, 1, 3, 5, 6
		bubbleSort(citations, citations.length);
		int answer = 0;
		
		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		writer.write(Integer.toString(solution(new int[] {3, 0, 1, 6, 5})));
		writer.flush();
		reader.close();
		writer.close();
	}
}
