import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class I {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String text = reader.readLine();
		boolean isUppercaseState = false; 
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			char first = text.charAt(i);
			boolean isFirstUppercase = Character.isUpperCase(first);
			if (isUppercaseState ^ isFirstUppercase) {
				if (i < text.length() - 1) {
					char third = text.charAt(i + 1);
					boolean isThirdUppercase = Character.isUpperCase(third);
					if (!isFirstUppercase ^ isThirdUppercase) {
						isUppercaseState = !isUppercaseState; 
					}
				}
				count += 2;
			}
			else {
				count++;
			}
		}
		
		writer.write(Integer.toString(count));
		reader.close();
		writer.close();
	}

}