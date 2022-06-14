package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon16205 {
	private static String upper(String s) {
		return (char)(s.charAt(0) - 32) + s.substring(1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
		int notation = Integer.parseInt(stringTokenizer.nextToken());
		String variable = stringTokenizer.nextToken();
		String camel = "";
		String snake = "";
		String pascal = "";
		
		if (notation == 1) {
			camel = variable;
			snake = Character.toString(variable.charAt(0));
			for (int i = 1; i < variable.length(); i++) {
				if (variable.charAt(i) <= 'Z') {
					snake += "_" + Character.toString(variable.charAt(i)).toLowerCase();
				}
				else {
					snake += variable.charAt(i);
				}
			}
			pascal = upper(variable);
		}
		else if (notation == 2) {
			String[] word = variable.split("_");
			snake = variable;
			if (word.length == 1) {
				camel = snake;
				pascal = upper(snake);
			}
			else {
				camel = word[0] + upper(word[1]);
				pascal = upper(word[0]) + upper(word[1]);
			}
			
		}
		else {
			camel = (char)(variable.charAt(0) + 32) + variable.substring(1);
			snake = Character.toString((char)(variable.charAt(0) + 32));
			for (int i = 1; i < variable.length(); i++) {
				if (variable.charAt(i) <= 'Z') {
					snake += "_" + Character.toString(variable.charAt(i)).toLowerCase();
				}
				else {
					snake += variable.charAt(i);
				}
			}
			pascal = variable;
		}
		
		writer.write(camel + "\n");
		writer.write(snake + "\n");
		writer.write(pascal + "\n");
		reader.close();
		writer.close();
	}

}