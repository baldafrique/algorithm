package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon1059 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(reader.readLine());
		String[] str = reader.readLine().split(" ");
		int[] set = new int[num];
		int value = Integer.parseInt(reader.readLine());
		int idx = 0;
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			set[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(set);
		if (value < set[0]) {
//			 n이 집합 S의 모든 값보다 작은 경우
//			 집합 S의 최솟값이 set[0]인 경우 [
//			 [1, n], [1, n + 1], ... , [1, set[0] - 1]
//			 [2, n], [2, n + 1], ... , [2, set[0] - 1]
//			 ...
//			 [n, n + 1], [n, n + 2], ... , [n, set[0] - 1]
//			 따라서 조건을 성립하는 범위의 개수는 다음과 같음
//			 a(n) = (set[0] - n) * (n - 1) + set[0] - 1 - n
			cnt = (set[0] - value) * (value - 1) + set[0] -1- value;
		}
		else {
			for (int i = 0; i < num; i++) {
				if (set[i] > value) {
					idx = i - 1;
					break;
				}
			}
			for (int i = ++set[idx]; i < set[idx + 1] - 1; i++) {
				for (int j = i + 1; j < set[idx + 1]; j++) {
					if (i <= value && value <= j) {
						cnt++;
					}
				}
			}
		}
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}

}
