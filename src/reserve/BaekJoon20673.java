package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon20673 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		// 하루 신규 확진 수의 평균 p
		int p = Integer.parseInt(reader.readLine());
		// 하루 신규 입원 수의 평균 q
		int q = Integer.parseInt(reader.readLine());
		// q <= p
		// 저위험군 white
		// 고위험군 red
		// 나머지 yellow
		
		if (p <= 50 && q <= 10) {
			// white
			writer.write("White");
		}
		else if (q >= 30) {
			// red
			writer.write("Red");
		}
		else {
			// yellow
			writer.write("Yellow");
		}
		
		reader.close();
		writer.close();
	}

}