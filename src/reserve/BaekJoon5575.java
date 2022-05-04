package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon5575 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int[] start = new int[3];
			int[] end = new int[3];
			int[] time = new int[3];
			start[0] = Integer.parseInt(stringTokenizer.nextToken());
			start[1] = Integer.parseInt(stringTokenizer.nextToken());
			start[2] = Integer.parseInt(stringTokenizer.nextToken());
			end[0] = Integer.parseInt(stringTokenizer.nextToken());
			end[1] = Integer.parseInt(stringTokenizer.nextToken());
			end[2] = Integer.parseInt(stringTokenizer.nextToken());
			
			if (end[2] < start[2]) {
				end[1]--;
				end[2] += 60;
			}
			time[2] = end[2] - start[2];
			
			if (end[1] < start[1]) {
				end[0]--;
				end[1] += 60;
			}
			time[1] = end[1] - start[1];
			
			if (end[0] < start[0]) {
				end[0] += 24;
			}
			time[0] = end[0] - start[0];
			
			writer.write(time[0] + " " + time[1] + " " + time[2] + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
