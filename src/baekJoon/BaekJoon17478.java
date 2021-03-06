package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon17478 {
	
	static int num = 0;
	
	public static void underline(BufferedWriter writer, int n) throws IOException {
		for (int i = 0; i < num - n; i++) {
			writer.write("____");
		}
	}
	
	public static void recursion(BufferedWriter writer, int n) throws IOException {
		if (n != 0) {
			underline(writer, n);
			writer.write("\"재귀함수가 뭔가요?\"\n");
			underline(writer, n);
			writer.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
			underline(writer, n);
			writer.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
			underline(writer, n);
			writer.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
			recursion(writer, n - 1);
		}
		else {
			underline(writer, n);
			writer.write("\"재귀함수가 뭔가요?\"\n");
			underline(writer, n);
			writer.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
		}
		underline(writer, n);
		writer.write("라고 답변하였지.\n");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		num = Integer.parseInt(reader.readLine());
		writer.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		recursion(writer, num);
		
		
		writer.flush();
		reader.close();
		writer.close();
	}

}
