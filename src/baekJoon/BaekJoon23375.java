package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon23375 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int x = Integer.parseInt(stringTokenizer.nextToken());
		int y = Integer.parseInt(stringTokenizer.nextToken());
		int r = Integer.parseInt(reader.readLine());
		
		writer.write((x - r) + " " + (y + r) + "\n");
		writer.write((x + r) + " " + (y + r) + "\n");
		writer.write((x + r) + " " + (y - r) + "\n");
		writer.write((x - r) + " " + (y - r) + "\n");
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
