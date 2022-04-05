import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15025 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int l = Integer.parseInt(str.split(" ")[0]);
		int r = Integer.parseInt(str.split(" ")[1]);
		
		if (l == 0 && r == 0) {
			writer.write("Not a moose");
		} 
		else if (l == r) {
			writer.write("Even " + (l + r));
		}
		else {
			writer.write("Odd " + (l > r ? l : r) * 2);	
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
