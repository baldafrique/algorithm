package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon20867 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int S = Integer.parseInt(stringTokenizer.nextToken());
		int G = Integer.parseInt(stringTokenizer.nextToken());
		double left = Math.floor((double) M / G);
		double right = Math.floor((double) M / S);
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		double A = Double.parseDouble(stringTokenizer.nextToken());
		double B = Double.parseDouble(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		int L = Integer.parseInt(stringTokenizer.nextToken());
		int R = Integer.parseInt(stringTokenizer.nextToken());
		
		left += Math.floor(L / A);
		right+= Math.floor(R / B);
		
		writer.write(left < right ? "friskus" : "latmask");
		writer.flush();
		reader.close();
		writer.close();
	}

}
