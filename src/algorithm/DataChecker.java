/* 367건의 데이터 묶음이 들어올 때 각 데이터의 실제 개수와 입력된 데이터의 개수가 일치하는지 검사하는 프로그램을 작성하시오.
 * 입력되는 데이터의 형태는 다음과 같음
 * 
 * 2/4
 * 2/5
 * 12/4
 * 3건
 * 1/6
 * 5/4
 * 9/21
 * 4건
 * ... */

package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DataChecker {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 0;
		boolean isError = false;
		
		for (int i = 1; i <= 367; i++) {
			int count = 0;
			String temp = reader.readLine();
			while(!temp.substring(temp.length() - 1).equals("건")) {
				if (temp.substring(temp.length() - 1).equals("건")) {
					break;
				}
				count++;
				temp = reader.readLine();
			}
			
			if (count != Integer.parseInt(temp.substring(0, temp.length() - 1))) {
				writer.write("Error in : " + i + "\n");
				isError = true;
			}
			writer.flush();
			num++;
		}
		
		writer.write(isError ? "" : "No Error\n");
		writer.write("The number of people : " + num + "\n");
		writer.flush();
		reader.close();
		writer.close();
	}

}
