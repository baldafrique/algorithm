package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon15128 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		double number = Double.parseDouble(stringTokenizer.nextToken());
		
		number /= Integer.parseInt(stringTokenizer.nextToken());
		number *= Integer.parseInt(stringTokenizer.nextToken());
		number /= Integer.parseInt(stringTokenizer.nextToken());
		writer.write(number == (int) number ? "1" : "0");
		reader.close();
		writer.close();
	}

}