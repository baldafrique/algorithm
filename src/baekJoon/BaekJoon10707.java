package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10707 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

 		int X = Integer.parseInt(reader.readLine());
 		int basicY = Integer.parseInt(reader.readLine());
 		int limitY = Integer.parseInt(reader.readLine());
 		int extraY = Integer.parseInt(reader.readLine());
 		int usage = Integer.parseInt(reader.readLine());
 		
 		X *= usage; // X사 이용 시 요금
 		
 		// Y사 이용 시 기본요금만 청구되는 경우: basicY
 		
 		// Y사 이용 시 추가요금이 발생하는 경우: 기본요금 + 추가요금 
 		if (usage > limitY) {
 			basicY += extraY * (usage - limitY);
 		}
 		
 		writer.write(Integer.toString(X < basicY ? X : basicY));
 		
 		writer.flush();
		reader.close();
		writer.close();
	}

}
