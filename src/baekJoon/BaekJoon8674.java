package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon8674 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		long row = Long.parseLong(stringTokenizer.nextToken());
		long column = Long.parseLong(stringTokenizer.nextToken());
		
		if (row % 2 != 0 && column % 2 != 0) {
			writer.write(Long.toString(row < column ? row : column));
		}
		else {
			writer.write("0");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
