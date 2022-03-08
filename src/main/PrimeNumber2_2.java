package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrimeNumber2_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0; // 나눗셈의 횟수
		int idx = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		prime[idx++] = 2;
 		
 		for (int i = 3; i <= 1000; i += 2) { // 4 이상의 짝수는 2로 나누어떨어지므로 소수 아님
 			int j;
 			for (j = 1; j < idx; j++) { // prime[0]은 2인데 2로 나누어떨어지는 경우는 짝수이므로 위에서 이미 제외됨
 				cnt++;
 				if (i % prime[j] == 0) {
 					break;
 				}
 			}
 			if (j == idx) {
 				prime[idx++] = i;
 			}
 		}
 		
 		for (int i = 0; prime[i] != 0; i++) {
 			writer.write(prime[i] + "\n");
 		}
 		
 		writer.write(Integer.toString(cnt)); // 14622
 		writer.flush();
		reader.close();
		writer.close();
	}

}
