package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon25285 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			String input = reader.readLine();
			double height = Double.parseDouble(input.split(" ")[0]);
			double weight = Double.parseDouble(input.split(" ")[1]);
			
			if (height < 140.1) {
				writer.write("6");
			}
			else if (height < 146) {
				writer.write("5");
			}
			else if (height < 159) {
				writer.write("4");
			}
			else if (height < 161) {
				double bmi = weight / Math.pow(height / 100, 2); 
				if (16 <= bmi && bmi < 35) {
					writer.write("3");
				}
				else {
					writer.write("4");
				}
			}
			else if (height < 204) {
				double bmi = weight / Math.pow(height / 100, 2); 
				if (20 <= bmi && bmi < 25) {
					writer.write("1");
				}
				else if ((18.5 <= bmi && bmi < 20) || (25 <= bmi && bmi < 30)) {
					writer.write("2");
				}
				else if ((16 <= bmi && bmi < 18.5) || (30 <= bmi && bmi < 35)) {
					writer.write("3");
				}
				else if (bmi < 16 || bmi >= 35) {
					writer.write("4");
				}
			}
			else {
				writer.write("4");
			}
			writer.write("\n");
		}
		
		
		reader.close();
		writer.close();
	}

}