package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon1076 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Long> data = new HashMap<>();
		
		data.put("black", (long) 0);
		data.put("brown", (long) 1);
		data.put("red", (long) 2);
		data.put("orange", (long) 3);
		data.put("yellow", (long) 4);
		data.put("green", (long) 5);
		data.put("blue", (long) 6);
		data.put("violet", (long) 7);
		data.put("grey", (long) 8);
		data.put("white", (long) 9);
		
		writer.write(Long.toString((long) ((data.get(reader.readLine()) * 10 + data.get(reader.readLine())) * Math.pow(10, data.get(reader.readLine())))));
				
		writer.flush();
		reader.close();
		writer.close();
	}

}
