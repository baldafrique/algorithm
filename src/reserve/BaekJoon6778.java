package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon6778 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int antenna = Integer.parseInt(reader.readLine());
		int eyes = Integer.parseInt(reader.readLine());
		
		if (antenna >= 3 && eyes <= 4) {
			writer.write("TroyMartian\n");
		}
		if (antenna <= 6 && eyes >= 2) {
			writer.write("VladSaturnian\n");
		}
		if (antenna <= 2 && eyes <= 3) {
			writer.write("GraemeMercurian");
		}
		
		reader.close();
		writer.close();
	}

}