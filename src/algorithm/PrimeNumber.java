package algorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 10;
		int counter = 0; // 연산 횟수
//		boolean primeNumberCheck = true;
		
		// 첫번째 방법
		for(int i=2; i<=input; i++) {
			int j;
			for(j=2; j<i; j++) {
				counter++;
				if(i%j == 0) {
					break;
				}
			}
			if (j == i) {
				System.out.println(i);
			}
		}
		System.out.println(counter);
		
		// 두번째 방법
//		for(int i=2; i<=input; i++) {
//			for(int j=2; j<i; j++) {
//				if(i%j == 0) {
//					primeNumberCheck = false;
//				}
//			}
//			if (primeNumberCheck) {
//				System.out.println(i);
//			} else {
//				primeNumberCheck = true;
//			}
//		}
	}

}
