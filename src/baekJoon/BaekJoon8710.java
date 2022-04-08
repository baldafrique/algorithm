package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon8710 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = reader.readLine();
		int height = Integer.parseInt(str.split(" ")[0]);
		int goal = Integer.parseInt(str.split(" ")[1]);
		int bumpSize = Integer.parseInt(str.split(" ")[2]);
		int cnt = 0;
		
		while (height + bumpSize * cnt < goal) {
			cnt++;
		}
		
		writer.write(Integer.toString(cnt));
		writer.flush();
		reader.close();
		writer.close();
	}

}
