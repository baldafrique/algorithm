package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24356 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = reader.readLine();
		
		int t1 = Integer.parseInt(s.split(" ")[0]);
		int m1 = Integer.parseInt(s.split(" ")[1]);
		int t2 = Integer.parseInt(s.split(" ")[2]);
		int m2 = Integer.parseInt(s.split(" ")[3]);
		
		int minSum1 = t1 * 60 + m1;
		int minSum2 = t2 * 60 + m2;
		int minSumDiff = 0;
		
		if (minSum1 > minSum2) {
			minSumDiff = minSum2 + 24 * 60 - minSum1; 
		}
		else if (minSum1 < minSum2) {
			minSumDiff = minSum2 - minSum1;
		}
		
		int rotationNum = minSumDiff / 30;
		
		writer.write(minSumDiff + " " + rotationNum);
		
		writer.flush();
		reader.close();
		writer.close();

	}

}
