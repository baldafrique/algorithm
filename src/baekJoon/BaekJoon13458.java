package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon13458 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer;
		int[] classroom = new int[N];
		long sup = 0;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			classroom[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int C = Integer.parseInt(stringTokenizer.nextToken());
		
		for (int i = 0; i < N; i++) {
			classroom[i] -= B;
			sup++;
			if (classroom[i] > 0) {
				if (classroom[i] % C == 0) {
					sup += classroom[i] / C;	
				}
				else {
					sup += classroom[i] / C + 1;
				}
			}
		}
		
		writer.write(Long.toString(sup));
		writer.flush();
		reader.close();
		writer.close();
	}
}
