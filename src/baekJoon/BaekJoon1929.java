package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon1929 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		boolean[] bPrime = new boolean[N + 1];
		
		bPrime[1] = true;
		        
		for(int i = 2; i <= N; i++) {
		    for(int j = 2; i * j <= N; j++) {
		        bPrime[i * j] = true;
		    }
		}
		        
		for(int i = M; i <= N; i++) {
		    if(!bPrime[i]) {
		    	writer.write(i + "\n");
		    }
		}

		writer.flush();
		reader.close();
		writer.close();
	}

}