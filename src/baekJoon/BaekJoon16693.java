package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16693 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		
		input = reader.readLine();
		int A1 = Integer.parseInt(input.split(" ")[0]);
		int P1 = Integer.parseInt(input.split(" ")[1]);
		double P3 = (double) A1 / P1;
		
		input = reader.readLine();
		int R1 = Integer.parseInt(input.split(" ")[0]);
		int P2 = Integer.parseInt(input.split(" ")[1]);
		double P4 = Math.PI * R1 * R1 / P2; 
		
		writer.write(P3 > P4 ? "Slice of pizza" : "Whole pizza");
		reader.close();
		writer.close();
	}

}