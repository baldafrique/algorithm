package codility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class CodilityDistinct {
	public static void main(String[] args) throws IOException {
		class Solution {
			public int solution(int[] A) {
				Set<Integer> set = new HashSet<>();
				for (int a : A) {
					set.add(a);
				}
				return set.size();
			}
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Solution solution = new Solution();
		writer.write(Integer.toString(solution.solution(new int[] {2, 1, 1, 2, 3, 1})));
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
