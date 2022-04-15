package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BaekJoon9046 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Character, Character> map = new HashMap<>();
		String clearChar = "abcdefghijklmnopqrstuvwxyz";
		String codeChar = "wghuvijxpqrstacdebfklmnoyz";
		String clearStr;
		String codeStr = "";
		
		// clearChar와 codeChar를 mapping
		for (int i = 0; i < 26; i++) {
			map.put(clearChar.charAt(i), codeChar.charAt(i));
		}
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++) {
			// 각 문자가 나오는 횟수를 count에 기록
			Map<Character, Integer> count = new HashMap<>();
			clearStr = reader.readLine();
			for (int j = 0; j < clearStr.length(); j++) {
				if (clearStr.charAt(j) != ' ') {
					// 문자가 처음 나오는게 아닌 경우
					if (count.containsKey(clearStr.charAt(j))) {
						// 횟수 1 증가
						count.put(clearStr.charAt(j), count.get(clearStr.charAt(j)) + 1);
					}
					// 문자가 처음 나오는 경우
					else {
						// 해당 문자와 횟수를 입력
						count.put(clearStr.charAt(j), 1);
					}
				}
				
				if (clearStr.charAt(j) == ' ') {
					// 공백인 경우 그대로
					codeStr += clearStr.charAt(j);
				}
				else {
					// 공백이 아닌 경우 암호화된 문자로
					codeStr += map.get(clearStr.charAt(j));
				}
			}
			
			writer.write(codeStr);
			
			Iterator<Character> keys = count.keySet().iterator();
			String ret = null;
			while (keys.hasNext()) {
				// count의 키를 하나씩 받아서
				char key = keys.next();
				
				// 해당 문자가 가장 많이 나왔다면
				if (count.get(key) == Collections.max(count.values())) {
					// 해당 문자를 리턴
					if (ret == null) {
						ret = Character.toString(key);
					}
					// 단, 가장 많이 나온 문자가 2개 이상인 경우 "?" 리턴
					else {
						ret = "?";
						break;
					}
				}
			}
			writer.write(ret + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
