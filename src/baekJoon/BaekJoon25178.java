package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon25178 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		String A = reader.readLine();
		String B = reader.readLine();
		String a = A.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
		String b = B.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
		boolean isDuramuri = true;
		
		// 두 단어의 첫 글자와 마지막 글자는 동일하다.
		if (A.charAt(0) != B.charAt(0) || A.charAt(N - 1) != B.charAt(N - 1)) {
			isDuramuri = false;
		}
		
		// 모음을 제거한 두 문자열이 같다.
		if (isDuramuri) {
			if (!a.equals(b)) {
				isDuramuri = false;
			}
		}
		
		// 한 단어를 재배열하여 다른 단어로 만들 수 있다.
		if (isDuramuri) {
			char[] x = A.toCharArray();
			char[] y = B.toCharArray();
			Arrays.sort(x);
			Arrays.sort(y);
			
			for (int i = 0; i < N; i++) {
				if (x[i] != y[i]) {
					isDuramuri = false;
					break;
				}
			}
		}
		
		writer.write(isDuramuri ? "YES" : "NO");
		reader.close();
		writer.close();
	}
}