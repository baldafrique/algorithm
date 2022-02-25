package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9654 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		writer.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n");
		writer.write("N2 Bomber      Heavy Fighter  Limited    21        \n");
		writer.write("J-Type 327     Light Combat   Unlimited  1         \n");
		writer.write("NX Cruiser     Medium Fighter Limited    18        \n");
		writer.write("N1 Starfighter Medium Fighter Unlimited  25        \n");
		writer.write("Royal Cruiser  Light Combat   Limited    4         ");
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
