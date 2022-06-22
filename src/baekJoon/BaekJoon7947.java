package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon7947 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int z = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < z; i++) {
			double red = 0;
			double green = 0;
			double blue = 0;
			
			for (int j = 0; j < 10; j++) {
				StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
				red += Integer.parseInt(stringTokenizer.nextToken());
				green += Integer.parseInt(stringTokenizer.nextToken());
				blue += Integer.parseInt(stringTokenizer.nextToken());
			}
			
			writer.write(Math.round(red / 10) + " ");
			writer.write(Math.round(green / 10) + " ");
			writer.write(Math.round(blue / 10) + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
