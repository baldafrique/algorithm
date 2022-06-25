import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = Integer.parseInt(reader.readLine());
		int numberOfKinds = Integer.parseInt(reader.readLine());
		int calculation = 0;
		
		for (int i = 0; i < numberOfKinds; i++) {
			String data = reader.readLine();
			int price = Integer.parseInt(data.split(" ")[0]);
			int number = Integer.parseInt(data.split(" ")[1]);
			calculation += price * number;
		}
		
		writer.write(sum == calculation ? "Yes" : "No");
		writer.flush();
		reader.close();
		writer.close();
	}

}
