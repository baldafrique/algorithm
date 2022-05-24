package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10103 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		int changYoung = 100;
		int sangDeok = 100;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int changYeoungDice = Integer.parseInt(stringTokenizer.nextToken());
			int sangDeokDice = Integer.parseInt(stringTokenizer.nextToken());
			if (changYeoungDice > sangDeokDice) {
				sangDeok -= changYeoungDice;
			}
			else if (changYeoungDice < sangDeokDice){
				changYoung -= sangDeokDice;
			}
		}
		
		writer.write(changYoung + "\n" + sangDeok);
		reader.close();
		writer.close();
	}

}