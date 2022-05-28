package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17362 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine()) % 8;

		switch(n) {
		case 1:
			n = 1;
			break;
		case 0:
		case 2:
			n = 2;
			break;
		case 3:
		case 7:
			n = 3;
			break;
		case 4:
		case 6:
			n = 4;
			break;
		case 5:
			n = 5;
			break;
		}
		
		writer.write(Integer.toString(n));
		reader.close();
		writer.close();
	}

}