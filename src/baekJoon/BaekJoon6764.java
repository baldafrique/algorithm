package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon6764 {
	private enum EState{
		eRising,
		eDiving,
		eConstant;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean validity = true;
		int previous = Integer.parseInt(reader.readLine());
		int now = Integer.parseInt(reader.readLine());
		EState estate;
		
		if (previous < now) {
			estate = EState.eRising;
		}
		else if (previous == now) {
			estate = EState.eConstant;
		}
		else {
			estate = EState.eDiving;
		}
		
		for (int i = 0; i < 2; i++) {
			previous = now;
			now = Integer.parseInt(reader.readLine());
			
			if (estate == EState.eRising && previous >= now) {
				validity = false;
				break;
			}
			
			if (estate == EState.eDiving && previous <= now) {
				validity = false;
				break;
			}
			
			if (estate == EState.eConstant && previous != now) {
				validity = false;
				break;
			}
		}
		
		if (validity) {
			switch (estate) {
			case eRising:
				writer.write("Fish Rising");
				break;
			case eDiving:
				writer.write("Fish Diving");
				break;
			case eConstant:
				writer.write("Fish At Constant Depth");
				break;
			default:
				break;
			}
		}
		else {
			writer.write("No Fish");
		}
		
		reader.close();
		writer.close();
	}
}
