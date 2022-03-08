package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrimeNumber3_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0; // 나눗셈의 횟수
		int idx = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		prime[idx++] = 2;
		prime[idx++] = 3;
 		
 		for (int i = 5; i <= 1000; i += 2) { // 4 이상의 짝수는 2로 나누어떨어지므로 소수 아님
 			boolean flag = false;
 			for (int j = 1; Math.pow(prime[j], 2) <= i; j++) { // prime[0]은 2인데 2로 나누어떨어지는 경우는 짝수이므로 위에서 이미 제외됨
 				cnt += 2;
 				if (i % prime[j] == 0) {
 					flag = true;
 					break;
 				}
 			}
 			if (!flag) {
 				prime[idx++] = i;
 				cnt++;
 			}
 		}
 		
 		for (int i = 0; prime[i] != 0; i++) {
 			writer.write(prime[i] + "\n");
 		}
 		
 		writer.write(Integer.toString(cnt)); // 3774
 		writer.flush();
		reader.close();
		writer.close();
	}

}
