import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15474 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int A = Integer.parseInt(str.split(" ")[1]);
		int B = Integer.parseInt(str.split(" ")[2]);
		int C = Integer.parseInt(str.split(" ")[3]);
		int D = Integer.parseInt(str.split(" ")[4]);
		
		int numX = (int) Math.ceil(N / (float) A);
		int numY = (int) Math.ceil(N / (float) C);
		
		writer.write(Integer.toString(numX * B < numY * D ? numX * B : numY * D));
		writer.flush();
		reader.close();
		writer.close();
	}

}
