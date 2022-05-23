package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2985 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int[] data = new int[3];
		
		for (int i = 0; i < 3; i++) {
			data[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		String equationA = Integer.toString(data[0]);
		String equationB = data[0] + "=" + data[1];
		
		if (data[0] + data[1] == data[2]) {
			equationA += "+";
		}
		else if (data[0] - data[1] == data[2]) {
			equationA += "-";
		}
		else if (data[0] * data[1] == data[2]) {
			equationA += "*";
		}
		else if (data[0] / data[1] == data[2]) {
			equationA += "/";
		}
		else if (data[1] + data[2] == data[0]) {
			equationB += "+";
		}
		else if (data[1] - data[2] == data[0]) {
			equationB += "-";
		}
		else if (data[1] * data[2] == data[0]) {
			equationB += "*";
		}
		else if (data[1] / data[2] == data[0]) {
			equationB += "/";
		}
		
		if (equationA.equals(Integer.toString(data[0]))) {
			equationB += data[2];
			writer.write(equationB);
		}
		else {
			equationA += data[1] + "=" + data[2];
			writer.write(equationA);
		}
		
		reader.close();
		writer.close();
	}

}