package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon13597 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = reader.readLine();
		int firstCard = Integer.parseInt(input.split(" ")[0]);
		int secondCard = Integer.parseInt(input.split(" ")[1]);
		
		writer.write(Integer.toString(firstCard > secondCard ? firstCard : secondCard));
		reader.close();
		writer.close();
	}

}