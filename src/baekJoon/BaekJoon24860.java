package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon24860 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder(reader.readLine())
				.append(" ").append(reader.readLine())
				.append(" ").append(reader.readLine());
		
		StringTokenizer stringTokenizer = new StringTokenizer(builder.toString());
		long Vk = Long.parseLong(stringTokenizer.nextToken());
		long Jk = Long.parseLong(stringTokenizer.nextToken());
		long Vl = Long.parseLong(stringTokenizer.nextToken());
		long Jl = Long.parseLong(stringTokenizer.nextToken());
		long Vh = Long.parseLong(stringTokenizer.nextToken());
		long Dh = Long.parseLong(stringTokenizer.nextToken());
		long Jh = Long.parseLong(stringTokenizer.nextToken());

		writer.write(Long.toString(((Vk * Jk) + (Vl * Jl)) * (Vh * Dh * Jh)));
		reader.close();
		writer.close();
	}

}