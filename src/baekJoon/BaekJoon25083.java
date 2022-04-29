package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon25083 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		writer.write("         ,r'\"7\n");
		writer.write("r`-_   ,'  ,/\n");
		writer.write(" \\. \". L_r'\n");
		writer.write("   `~\\/\n");
		writer.write("      |\n");
		writer.write("      |\n");
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
