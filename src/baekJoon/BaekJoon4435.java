package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon4435 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(reader.readLine());
		StringTokenizer stringTokenizer;
		for (int i = 0; i < T; i++) {
			int gandalf = 0;
			int sauron = 0;
			
			stringTokenizer = new StringTokenizer(reader.readLine());			
			gandalf += Integer.parseInt(stringTokenizer.nextToken());
			gandalf += Integer.parseInt(stringTokenizer.nextToken()) * 2;
			gandalf += Integer.parseInt(stringTokenizer.nextToken()) * 3;
			gandalf += Integer.parseInt(stringTokenizer.nextToken()) * 3;
			gandalf += Integer.parseInt(stringTokenizer.nextToken()) * 4;
			gandalf += Integer.parseInt(stringTokenizer.nextToken()) * 10;
			
			stringTokenizer = new StringTokenizer(reader.readLine());
			sauron += Integer.parseInt(stringTokenizer.nextToken());
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 2;
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 2;
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 2;
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 3;
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 5;
			sauron += Integer.parseInt(stringTokenizer.nextToken()) * 10;
			
			if (gandalf > sauron) {
				writer.write("Battle " + (i + 1) + ": Good triumphs over Evil\n");
			}
			else if (gandalf < sauron) {
				writer.write("Battle " + (i + 1) + ": Evil eradicates all trace of Good\n");	
			}
			else {
				writer.write("Battle " + (i + 1) + ": No victor on this battle field\n");
			}
		}
		
		reader.close();
		writer.close();
	}

}