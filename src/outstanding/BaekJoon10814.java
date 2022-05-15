package outstanding;
// unsolved

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon10814 {
	private static class Person {
		int age;
		String name;
		int order;
		
		private Person(int age, String name, int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}
	}
	
	private static void swap(Person[] people, int i, int j) {
		Person temp = people[i];
		people[i] = people[j];
		people[j] = temp;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(reader.readLine());
		Person[] people = new Person[N];
		StringTokenizer stringTokenizer;
		
		for (int i = 0; i < N; i++) {
			stringTokenizer = new StringTokenizer(reader.readLine());
			int age = Integer.parseInt(stringTokenizer.nextToken());
			String name = stringTokenizer.nextToken();
			people[i] = new Person(age, name, i + 1);
		}
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (people[i].age > people[j].age) {
					swap(people, i, j);
				}
				else if (people[i].age == people[j].age && people[i].order > people[j].order) {
					swap(people, i, j);
				}
			}
		}
		
		for (Person person : people) {
			writer.write(person.age + " " + person.name + "\n");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
