import java.util.Arrays;

public class CodilityTriangle {
	public int solution(int[] A) {
	     long[] B = new long[A.length];

	     for (int i = 0; i < A.length; i++) {
	         B[i] = A[i];
	     }

	     Arrays.sort(B);

	     for (int i = 0; i < B.length - 2; i++) {
	         if (B[i] + B[i+1] > B[i + 2]) {
	             return 1; 
	         }
	     }

	     return 0;
	 }
}
