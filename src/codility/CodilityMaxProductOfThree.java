package codility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CodilityMaxProductOfThree {
	public static void main(String[] args) throws IOException {
		class Solution {
			public int solution(int[] A) {
				int last = A.length - 1;
				Arrays.sort(A);
				return Math.max(A[0] * A[1] * A[last], A[last - 2] * A[last - 1] * A[last]);
			}
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Solution solution = new Solution();
		int[] A = {-3, 1, 2, -2, 5, 6};
		writer.write(Integer.toString(solution.solution(A)));
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
