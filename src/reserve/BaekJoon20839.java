package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon20839 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] criteria = new int[3];
		criteria[0] = Integer.parseInt(stringTokenizer.nextToken());
		criteria[1] = Integer.parseInt(stringTokenizer.nextToken());
		criteria[2] = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(reader.readLine());
		int[] student = new int[3];
		student[0] = Integer.parseInt(stringTokenizer.nextToken());
		student[1] = Integer.parseInt(stringTokenizer.nextToken());
		student[2] = Integer.parseInt(stringTokenizer.nextToken());
		char grade;
		
		if (student[0] >= criteria[0] && student[1] >= criteria[1] && student[2] >= criteria[2]) {
			grade = 'A';
		}
		else if (student[0] >= criteria[0] / 2 && student[1] >= criteria[1] && student[2] >= criteria[2]) {
			grade = 'B';
		}
		else if (student[1] >= criteria[1] && student[2] >= criteria[2]) {
			grade = 'C';
		}
		else if (student[1] >= criteria[1] / 2 && student[2] >= criteria[2]) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}
		
		writer.write(grade);
		writer.flush();
		reader.close();
		writer.close();
	}
}
