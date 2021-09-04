package algorithm;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// 정수 n이 소수라면 2~n-1까지의 어떤 소수로도 나누어 떨어지지 않는다는 사실을 통해 알고리즘 성능 개선
		
		int input = 100;
		int counter = 0; // 연산 횟수
		int index = 0; // 찾은 소수 개수
		int[] prime = new int[100]; // 찾은 소수를 저장하는 배
		
		prime[index++] = 2; // 2는 소수
		
		for (int i=3; i<=input; i+=2) { // 대상은 홀수만(짝수는 2로 나누어 떨어지므로 소수가 될 수 없음)
			int j;
			for (j=1; j<index; j++) { // 이미 찾은 소수로 나누어 봄
				counter++;
				if (i%prime[j] == 0) { // 나누어 떨어지는 경우 소수가 아님
					break;
				}
			}
			if (j == index) { // 마지막까지 나누어 떨어지지 않는 경우
				prime[index++] = i; // 소수라고 배열에 저장
			}
			
		}
		for (int i=0; i<index; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("연산 횟수 : " + counter);
	}

}
