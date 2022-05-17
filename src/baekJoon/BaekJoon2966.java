package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2966 {
	private static class Student{
		private char[] answer;
		private int score;
		private String name;
		
		public Student(char[] answer, String name) {
			this.score = 0;
			this.answer = answer;
			this.name = name;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		String answers = reader.readLine();
		Student[] students = new Student[3];
		students[0] = new Student(new char[] {'A', 'B', 'C'}, "Adrian");
		students[1] = new Student(new char[] {'B', 'A', 'B', 'C'}, "Bruno");
		students[2] = new Student(new char[] {'C', 'C', 'A', 'A', 'B', 'B'}, "Goran");
		
		for (int i = 0; i < N; i++) {
			if (students[0].answer[i % 3] == answers.charAt(i)) {
				students[0].score++;
			}
			
			if (students[1].answer[i % 4] == answers.charAt(i)) {
				students[1].score++;
			}
			
			if (students[2].answer[i % 6] == answers.charAt(i)) {
				students[2].score++;
			}
		}
		
		int max = Math.max(students[0].score, Math.max(students[1].score, students[2].score));
		
		writer.write(max + "\n");
		for (Student student : students) {
			if (student.score == max) {
				writer.write(student.name + "\n");
			}
		}
		
		reader.close();
		writer.close();
	}
}