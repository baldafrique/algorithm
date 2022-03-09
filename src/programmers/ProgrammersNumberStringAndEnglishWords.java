package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProgrammersNumberStringAndEnglishWords {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
 		
 		String str = reader.readLine();
 		int idx = 0;
 		String result = "";
 		
 		while (idx < str.length()) {
 			if (str.charAt(idx) < 'a') {
 				result += str.charAt(idx++);
 				continue;
 			}
 			else if (str.charAt(idx) == 'z') {
 				result += 0;
 				idx += 4;
 			}
 			else if (str.charAt(idx) == 'o') {
 				result += 1;
 				idx += 3;
 			}
 			else if (str.charAt(idx) == 't') {
 				if (str.charAt(idx + 1) == 'w') {
 					result += "2";
 					idx += 3;
 				}
 				else {
 					result += "3";
 					idx += 5;
 				}
 			}
 			else if (str.charAt(idx) == 'f') {
 				if (str.charAt(idx + 1) == 'o') {
 					result += "4";
 				}
 				else {
 					result += "5";
 				}
 				idx += 4;
 			}
 			else if (str.charAt(idx) == 's') {
 				if (str.charAt(idx + 1) =='i') {
 					result += "6";
 					idx += 3;
 				}
 				else {
 					result += "7";
 					idx += 5;
 				}
 			}
 			else if (str.charAt(idx) == 'e') {
 				result += 8;
 				idx += 5;
 			}
 			else {
 				result += 9;
 				idx += 4;
 			}
 		}
 		
 		writer.write(result);
 		writer.flush();
		reader.close();
		writer.close();
	}

}
