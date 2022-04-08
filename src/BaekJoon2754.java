import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2754 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = reader.readLine();
		
		switch(str) {
		case "A+":
			str = "4.3";
			break;
		case "A0":
			str = "4.0";
			break;
		case "A-":
			str = "3.7";
			break;
		case "B+":
			str = "3.3";
			break;
		case "B0":
			str = "3.0";
			break;			
		case "B-":
			str = "2.7";
			break;
		case "C+":
			str = "2.3";
			break;
		case "C0":
			str = "2.0";
			break;
		case "C-":
			str = "1.7";
			break;
		case "D+":
			str = "1.3";
			break;
		case "D0":
			str = "1.0";
			break;
		case "D-":
			str = "0.7";
			break;
		case "F":
			str = "0.0";
			break;
		}
		
		writer.write(str);
		writer.flush();
		reader.close();
		writer.close();
	}
}
