package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon16199 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		int[] birth = new int[3];
		int[] date = new int[3];
		int age;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		
		birth[0] = Integer.parseInt(stringTokenizer.nextToken());
		birth[1] = Integer.parseInt(stringTokenizer.nextToken());
		birth[2] = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		date[0] = Integer.parseInt(stringTokenizer.nextToken());
		date[1] = Integer.parseInt(stringTokenizer.nextToken());
		date[2] = Integer.parseInt(stringTokenizer.nextToken());
		
		// 만 나이
		age = date[0] - birth[0] - 1;
		if (date[1] > birth[1] || date[1] == birth[1] &&  date[2] >= birth[2]) {
			age++;
		}
		writer.write(age + "\n");
		
		// 세는 나이
		age = date[0] - birth[0] + 1;
		writer.write(age + "\n");

		// 연 나이
		age = date[0] - birth[0];
		writer.write(age + "\n");
		
		reader.close();
		writer.close();
	}
}
