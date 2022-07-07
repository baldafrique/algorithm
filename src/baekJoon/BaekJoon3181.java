package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon3181 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = reader.readLine().split(" ");
		String ret = "";
		Set<String> set = new HashSet<>();
		set.add("i");
		set.add("pa");
		set.add("te");
		set.add("ni");
		set.add("niti");
		set.add("a");
		set.add("ali");
		set.add("nego");
		set.add("no");
		set.add("ili");
		
		for (int i = 0; i < input.length; i++) {
			if (i == 0 || !set.contains(input[i])) {
				ret += input[i].toUpperCase().charAt(0);
			}
		}
		
		writer.write(ret);
		writer.flush();
		reader.close();
		writer.close();
	}
}
