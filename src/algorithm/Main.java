package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int[] arr = {9, 3, 9, 3, 9, 7, 9, 7, 24};
 		Set<Integer> map = new HashSet<>();
 		
 		for (int i = 0; i < arr.length; i++) {
 			if (map.contains(arr[i])) {
 				map.remove(arr[i]);
 			}
 			else {
 				map.add(arr[i]);
 			}
 		}
 		
 		String str = map.toString();
 		str = str.substring(1, str.length() - 1);
 		writer.write(Integer.parseInt(str));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
