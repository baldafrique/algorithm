package dataStructuresAlgorithms;

public class Fibonacci {
	
	static int count = 0;

	public static void main(String[] args) {
		int n = 10;
		int r1 = 1;
		int r2 = 1;
		int result = 0;
		
		// Iteration
		for (int i = 3; i <= n; i++) {
			count++;
			result = r1 + r2;
			r1 = r2;
			r2 = result;
		}
		System.out.println(result + " " + count);
		
		// Recursion
		count = 0;
		result = fibo(n);
		System.out.println(result + " " + count);
	}

	private static int fibo(int n) {
		count++;
		if (n <= 2) {
			return 1;
		}
		else {
			return fibo(n - 1) + fibo(n - 2);	
		}
	}

}
