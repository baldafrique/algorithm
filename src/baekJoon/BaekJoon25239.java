package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon25239 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String time = reader.readLine();
		int hour = Integer.parseInt(time.split(":")[0]);
		int minute = Integer.parseInt(time.split(":")[1]);
		int[][] sections = new int[6][2];
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int number = Integer.parseInt(reader.readLine());
		int recovery = 0;
		
		for (int i = 0; i < 6; i++) {
			sections[i][0] = Integer.parseInt(stringTokenizer.nextToken());
			sections[i][1] = 1;
		}
		
		for (int i = 0; i < number; i++) {
			String event = reader.readLine().split(" ")[1];
			switch (event.charAt(event.length() - 1)) {
			case '^':
				sections[hour == 12 ? 0 : hour / 2][1] = 0;
				break;
			case 'N':
				minute += Integer.parseInt(event.substring(0, event.length() - 3));
				if (minute >= 60) {
					hour++;
					minute -= 60;
					if (hour > 12) {
						hour -= 12;
					}
				}
				break;
			case 'R':
				hour += Integer.parseInt(event.substring(0, event.length() - 4));
				if (hour > 12) {
					hour -= 12;
				}
				break;
			default:
				break;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			if (sections[i][1] == 1) {
				recovery += sections[i][0];
			}
		}
		
		writer.write(Integer.toString(recovery >= 100 ? 100 : recovery));
		reader.close();
		writer.close();
	}

}