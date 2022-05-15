package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon13410 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		ArrayList<Integer> arrayList = new ArrayList<>();
		String[] strings = new String[K];
		
		// N단의 결과를 뒤집어서 문자열로 저장
		for (int i = 0; i < K; i++) {
			strings[i] = Integer.toString((i + 1) * N);
			String temp = "";
			for (int j = strings[i].length() - 1; j >= 0; j--) {
				temp += strings[i].charAt(j);
			}
			strings[i] = temp;
		}
		
		// 문자열 형태인 결과를 정수로 바꿔 리스트에 저장
		for (String s : strings) {
			arrayList.add(Integer.parseInt(s));
		}
		
		writer.write(Integer.toString(Collections.max(arrayList)));
		reader.close();
		writer.close();
	}
}