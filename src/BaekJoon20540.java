import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20540 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String type = reader.readLine();
		
		if (type.charAt(0) == 'E') {
			writer.write('I');
		}
		else {
			writer.write('E');	
		}
		
		if (type.charAt(1) == 'S') {
			writer.write('N');	
		}
		else {
			writer.write('S');
		}
		
		if (type.charAt(2) == 'T') {
			writer.write('F');	
		}
		else {
			writer.write('T');
		}
		
		if (type.charAt(3) == 'J') {
			writer.write('P');	
		}
		else {
			writer.write('J');
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
