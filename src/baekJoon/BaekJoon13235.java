package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon13235 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = reader.readLine();
		boolean isPalindrome = true;
		int i = 0;
		int j = word.length() - 1;
		
		while (i < j) {
			if (word.charAt(i++) != word.charAt(j--)) {
				isPalindrome = false;
			}
		}
		
		writer.write(isPalindrome ? "true" : "false");
		reader.close();
		writer.close();
	}

}