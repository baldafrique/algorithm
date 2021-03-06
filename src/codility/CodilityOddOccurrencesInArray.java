package codility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class CodilityOddOccurrencesInArray {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
 		int[] arr = {9, 3, 9, 3, 9, 7, 9, 7, 24};
 		Set<Integer> set = new HashSet<>();
 		
 		for (int i = 0; i < arr.length; i++) {
 			if (set.contains(arr[i])) {
 				set.remove(arr[i]);
 			}
 			else {
 				set.add(arr[i]);
 			}
 		}
 		
 		String str = set.toString();
 		str = str.substring(1, str.length() - 1);
 		writer.write(Integer.parseInt(str));
 		writer.flush();
		reader.close();
		writer.close();
	}

}
