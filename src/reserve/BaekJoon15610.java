package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15610 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int area = Integer.parseInt(reader.readLine());
		double side = Math.sqrt(area);
		double border = side * 4;
		
		writer.write(Double.toString(border));
		reader.close();
		writer.close();
	}

}