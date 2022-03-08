package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17496 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = reader.readLine().split(" ");
		writer.write(Integer.toString((Integer.parseInt(str[0]) - 1) / Integer.parseInt(str[1]) * Integer.parseInt(str[2]) * Integer.parseInt(str[3])));
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
