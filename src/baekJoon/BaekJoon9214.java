package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9214 {

	// 초항 검색
	private static String search(String now) {
		// 이전항의 다음항이 현재항과 일치해야 함
		// 22같은 경우 이전항이 계속 22가 되므로 이전항이 현재항과 같으면 더이상 검색하지 않음
		while (next(previous(now)).equals(now) && !now.equals(previous(now))) {
			now = previous(now);
		}
		return now;
	}
	
	// 이전 항 검색
	private static String previous(String now) {
		if (now.length() % 2 != 0) {
			return now;
		}

		String previous = "";
		for (int i = 0; i < now.length(); i += 2) {
			for (int j = 0; j < now.charAt(i) - '0'; j++) {
				previous += now.charAt(i + 1);
			}
		}
		return previous;
	}
	
	// 다음 항 검색
	private static String next(String now) {
		String next = "";
		char target;
		int level = 1;
		for (int i = 0; i < now.length(); i++) {
			target = now.charAt(i);
			
			if (i == now.length() - 1 || target != now.charAt(i + 1)) {
				next += level;
				next += target;
				level = 1;
			}
			else {
				level++;
			}
	
		}
		return next;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String number = reader.readLine();
		
		for (int i = 1; !number.equals("0"); i++) {
			// 초항을 반환하는 함수
			writer.write("Test " + i + ": " + search(number) + "\n");
			number = reader.readLine();
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}