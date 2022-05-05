package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class BaekJoon17356 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		double A = Double.parseDouble(stringTokenizer.nextToken());
		double B = Double.parseDouble(stringTokenizer.nextToken());
		double M = (B - A) / 400;
		BigDecimal temp = new BigDecimal(1 / (1 + Math.pow(10, M)));
		writer.write(temp.toString());
		reader.close();
		writer.close();
	}
}
