package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		StringTokenizer s = new StringTokenizer(reader.readLine(), " ");
		ArrayList<String> ret = new ArrayList<>(); 
		int N = Integer.parseInt(s.nextToken());
		int M = Integer.parseInt(s.nextToken());
		
		for (int i = 0; i < N; i++) {
			set.add(reader.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			String tmp = reader.readLine();
			if (set.contains(tmp)) {
				ret.add(tmp);
			}
		}
		
		Collections.sort(ret);
		
		writer.write(ret.size() + "\n");
		for(String str : ret) {
			writer.write(str + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
