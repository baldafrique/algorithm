package main;

public class PrimeNumber3_1 {

	public static void main(String[] args) {
		//	n이 소수라면 n의 제곱근 이하의 어떤 소수로도 나누어떨어지지 않는다는 사실을 통해 알고리즘 개선
		
		int input = 10;
		int counter = 0; // 곱셈과 나눗셈의 횟수
		int index = 0; // 찾은 소수의 개수
		int[] prime = new int[100]; // 소수를 저장하는 배열
		
		prime[index++] = 2;
		prime[index++] = 3;
		
		for (int i = 5; i <= input; i += 2) { // 대상은 홀수만
			boolean flag = false;
			for (int j=1; prime[j] * prime[j] <= i; j++) {
				counter += 2;
				if (i % prime[j] == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[index++] = i;
				counter++;
			}
		}
		for (int i=0; i<index; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("연산 횟수 " + counter);
		
	}

}
