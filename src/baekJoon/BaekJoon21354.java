package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon21354 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int appleSum = Integer.parseInt(stringTokenizer.nextToken()) * 7;
		int pearSum = Integer.parseInt(stringTokenizer.nextToken()) * 13;
		
		writer.write(appleSum > pearSum ? "Axel" : appleSum < pearSum ? "Petra" : "lika");
		writer.flush();
		reader.close();
		writer.close();
	}

}