import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1074 {
	private static int cnt = 0;
	
	private static void recursion(int size, int row, int col) {
		if (size == 1) {
			return;
		}
		else if (row < size / 2 && col < size / 2) {
			recursion(size / 2, row, col);
		}
		else if (row < size / 2 && col >= size / 2) {
			cnt += size * size / 4;
			recursion(size / 2, row, col - size / 2);
		}
		else if (row >= size / 2 && col < size / 2) {
			cnt += (size * size / 4) * 2;
			recursion(size / 2, row - size / 2, col);
		}
		else {
			cnt += (size * size / 4) * 3;
			recursion(size / 2, row - size / 2, col - size / 2);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		int N = Integer.parseInt(input.split(" ")[0]);
		int row = Integer.parseInt(input.split(" ")[1]);
		int col = Integer.parseInt(input.split(" ")[2]);
		int size = (int) Math.pow(2, N);
		
		recursion(size, row, col);
		
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}

}
