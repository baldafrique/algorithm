package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20232 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String year = reader.readLine();
		
		switch (year) {
		case "1996":
		case "1997":
		case "2000":
		case "2007":
		case "2008":
		case "2013":
		case "2018":
			writer.write("SPbSU");
			break;
		case "2006":
			writer.write("PetrSU, ITMO");
			break;
		default:
			writer.write("ITMO");
			break;
		}
		
		reader.close();
		writer.close();
	}

}