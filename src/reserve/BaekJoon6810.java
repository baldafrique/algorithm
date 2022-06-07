package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon6810 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 91;
		
		sum += Integer.parseInt(reader.readLine());
		sum += Integer.parseInt(reader.readLine()) * 3;
		sum += Integer.parseInt(reader.readLine());

		writer.write("The 1-3-sum is " + sum);
		reader.close();
		writer.close();
	}

}