package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PyramidTemp {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
// 		int n = Integer.parseInt(reader.readLine());
// 		int s = Integer.parseInt(reader.readLine());
 		String str = reader.readLine();
 		int n = Integer.parseInt(str.split(" ")[0]);
 		int s = Integer.parseInt(str.split(" ")[1]);
 		int head = 0;
 		int tail = 0;
 		
 		for (int i = 1; i <= n; i++) {
 			for (int j = n - 1; j >= i; j--) {
 				writer.write(" ");
 			}	 
 			
 			if (i == 1) {
 	 			writer.write(s + "\n");
 	 			head = s;
 	 			continue;
 	 		}
 			
 			int temp = 0;
 			
 			if (i % 2 == 0) { //짝수 
 				temp = head + 1;
 				if (temp >= 10) {
 					temp = 1;
 				}
 				
 				for (int j = 0; j < 2 * i - 1; j++) {
 					writer.write(temp++ + "");
 					if (temp >= 10) {
 						temp = 1;
 					}
 				}
 				tail = temp;
 				writer.write("\n");
 			}
 			else { // 홀수 
 				temp = tail - 1;
 				for (int j = 0; j < 2 * i - 1; j++) {
 					temp++;
 					if (temp >= 10) {
 						temp = 1;
 					}
 				}
 				
 				head = temp;
 				
 				for (int j = 0; j < 2 * i - 1; j++) {
 					writer.write(temp-- + "");
 					if (temp < 1) {
 						temp = 9;
 					}
 				}
 				writer.write("\n");
 			}
 		}
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
