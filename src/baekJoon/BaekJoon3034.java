package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3034 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str.split(" ")[0]);
		int width = Integer.parseInt(str.split(" ")[1]);
		int height = Integer.parseInt(str.split(" ")[2]);
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
		for (int i = 0; i < num; i++) {
			writer.write((Integer.parseInt(reader.readLine()) <= diagonal ? "DA" : "NE") + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();

	}

}
