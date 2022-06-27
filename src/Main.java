import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] old = {2, 3, 4, 5, 6};
		int[] fresh = new int[7]; 
		System.arraycopy(old, 1, fresh, 2, 2);
		
		
		reader.close();
		writer.close();
	}

}
