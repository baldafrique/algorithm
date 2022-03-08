package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		int min = -1;
		int sum = 0;
		
		for (int i = m; i <= n; i++) {
			if (i == 2) { // 2인 경우 아래의 for문에 진입할 수 없기에 따로 처리
				sum += i;
				min = i; // m 이상 n 이하의 범위에 2가 있는 경우 범위 내 소수의 최솟값은 2
			}
			else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) { // 1과 자기자신을 제외하고 나누어 떨어지는 경우로 소수 아님
						break;
					}
					else if (j == i - 1) { // 1과 자기 자신을 제외하고 한번도 나누어 떨어지지 않은 경우 소수
						sum += i;
						if (min == -1) {
							min = i;
						}
					}
				}
			}
		}
		
		writer.write((min == -1 ? "" : (sum + "\n")) + Integer.toString(min));
		writer.flush();
		reader.close();
		writer.close();
	}

}
