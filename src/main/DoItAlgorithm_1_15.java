package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DoItAlgorithm_1_15 {
	
	public static void triangleLB(int n) throws IOException {
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				writer.write("*");
			}
			writer.write("\n");
		}
		writer.flush();
	}
	
	public static void triangleLU(int n) throws IOException {
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				writer.write("*");
			}
			writer.write("\n");
		}
		writer.flush();
	}
	
	public static void triangleRU(int n) throws IOException {
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i) {
					writer.write(" ");
				}
				else {
					writer.write("*");	
				}
			}
			writer.write("\n");
		}
		writer.flush();
	}
	
	public static void triangleRB(int n) throws IOException {
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i - 1) {
					writer.write(" ");
				}
				else {
					writer.write("*");	
				}
			}
			writer.write("\n");
		}
		writer.flush();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		triangleLB(Integer.parseInt(reader.readLine()));
		triangleLU(Integer.parseInt(reader.readLine()));
		triangleRU(Integer.parseInt(reader.readLine()));
		triangleRB(Integer.parseInt(reader.readLine()));
	}

}
