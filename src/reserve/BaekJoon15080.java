package reserve;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15080 {
	private enum ETime {
		EHour,
		EMin,
		ESec
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		int sumS = 0;
		int sumE = 0;
		int sum = 0;
		
		str = reader.readLine().replaceAll(" ", "");
		int[] timeS = new int[3];
		for (int i = 0; i < 3; i++) {
			timeS[i] = Integer.parseInt(str.split(":")[i]);
		}
		
		str = reader.readLine().replaceAll(" ", "");
		int[] timeE = new int[3];
		for (int i = 0; i < 3; i++) {
			timeE[i] = Integer.parseInt(str.split(":")[i]);
		}
		
		if (timeS[ETime.EHour.ordinal()] > timeE[ETime.EHour.ordinal()]) {
			timeE[ETime.EHour.ordinal()] += 24;
		}
		
		sumS = timeS[ETime.EHour.ordinal()] * 60 * 60 + timeS[ETime.EMin.ordinal()] * 60 + timeS[ETime.ESec.ordinal()];
		sumE = timeE[ETime.EHour.ordinal()] * 60 * 60 + timeE[ETime.EMin.ordinal()] * 60 + timeE[ETime.ESec.ordinal()];
		sum = sumE - sumS;
		
		writer.write(Integer.toString(sum));
		writer.flush();
		reader.close();
		writer.close();
	}

}
