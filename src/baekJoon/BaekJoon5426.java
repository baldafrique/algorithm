package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5426 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 0; i < number; i++) {
			String letter = bufferedReader.readLine();
			int size = (int) Math.sqrt(letter.length());
			String[] matrix = new String[size];
			for (int j = 0, k = 0; j < letter.length(); j += size) {
				matrix[k++] = letter.substring(j, j + size);
			}
			
			for (int j = size - 1; j >= 0; j--) {
				for (int k = 0; k < size; k++) {
					bufferedWriter.write(matrix[k].charAt(j));
				}
			}
			bufferedWriter.write("\n");
		}
		
		bufferedWriter.flush();
		bufferedReader.close();
		bufferedWriter.close();
	}

}