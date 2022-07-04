package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18330 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine()); // 다음달 사용예상량
		int k = Integer.parseInt(reader.readLine()) + 60; // 이번달 남은 양 
		
		if (n <= k) {
			writer.write(Integer.toString(n * 1500));
		}
		else {
			writer.write(Integer.toString(k * 1500 + (n - k) * 3000));
		}
		
		reader.close();
		writer.close();
	}

}