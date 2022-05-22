import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Double> map = new HashMap<>();
		double creditSum = 0;
		double sum = 0;
		
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		for (int i = 0; i < 20; i++) {
			String input = reader.readLine();
			double credit = Double.parseDouble(input.split(" ")[1]);
			String stringGrade = input.split(" ")[2];
			double grade;
			if (stringGrade.equals("P")) {
				continue;
			}
			else {
				grade = map.get(stringGrade);
				creditSum += credit;
				sum += credit * grade;
			}
			
		}
		
		sum /= creditSum;
		writer.write(Double.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}

}