package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17009 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		int a = 0;
 		int b = 0;
 		
 		a = Integer.parseInt(reader.readLine()) * 3 + Integer.parseInt(reader.readLine()) * 2 + Integer.parseInt(reader.readLine());
 		b = Integer.parseInt(reader.readLine()) * 3 + Integer.parseInt(reader.readLine()) * 2 + Integer.parseInt(reader.readLine());
 		
 		if (a > b) {
 			writer.write('A');
 		}
 		else if (a < b) {
 			writer.write('B');
 		}
 		else {
 			writer.write('T');
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
