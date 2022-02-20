package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class BaekJoon10170 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("NFC West       W   L  T\n");
		writer.write("-----------------------\n");
		writer.write("Seattle        13  3  0\n");
		writer.write("San Francisco  12  4  0\n");
		writer.write("Arizona        10  6  0\n");
		writer.write("St. Louis      7   9  0\n");
		writer.write("\n");
		writer.write("NFC North      W   L  T\n");
		writer.write("-----------------------\n");
		writer.write("Green Bay      8   7  1\n");
		writer.write("Chicago        8   8  0\n");
		writer.write("Detroit        7   9  0\n");
		writer.write("Minnesota      5  10  1\n");
		writer.flush();
		reader.close();
		writer.close();
	}

}
