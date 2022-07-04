package baekJoon;
<<<<<<< HEAD

=======
>>>>>>> beb6365c4766bf2da33926de94c72a33a6529941
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17903 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write(Integer.parseInt(reader.readLine().split(" ")[0]) < 8 ? "unsatisfactory" : "satisfactory");
		writer.flush();
		reader.close();
		writer.close();
	}

}