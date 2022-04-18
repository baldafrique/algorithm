package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon1351 {
	public static Map<Long, Long> seq = new HashMap<>();
	public static int P, Q; 
	
	public static long recursion(long x) {
		if (x == 0) {
			return 1;
		}
		else if (seq.containsKey(x)) {
			return seq.get(x);
		}
		else {
			seq.put(x, recursion(x / P) + recursion(x / Q));
			return seq.get(x);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long N = Long.parseLong(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		
		writer.write(Long.toString(recursion(N)));
		writer.flush();
		reader.close();
		writer.close();
	}
}
