package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16727 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		
		input = reader.readLine();
		int p1 = Integer.parseInt(input.split(" ")[0]);
		int s1 = Integer.parseInt(input.split(" ")[1]);
		
		input = reader.readLine();
		int s2 = Integer.parseInt(input.split(" ")[0]);
		int p2 = Integer.parseInt(input.split(" ")[1]);
		
		int p = p1 + p2;
		int s = s1 + s2;
		
		if (p == s) {
			if (p1 > s2) {
				writer.write("Esteghlal");
			}
			else if (p1 < s2) {
				writer.write("Persoplis");
			}
			else {
				writer.write("Penalty");
			}
		}
		else {
			if (p > s) {
				writer.write("Persoplis");
			}
			else {
				writer.write("Esteghlal");
			}
		}
		reader.close();
		writer.close();
	}

}