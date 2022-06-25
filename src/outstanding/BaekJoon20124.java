package outstanding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon20124 {
	public static class Person {
		String name;
		int score;
		
		Person(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		Person[] people = new Person[3];
		
		for (int i = 0; i < N; i++) {
			String data = reader.readLine();
			people[i] = new Person(data.split(" ")[0], Integer.parseInt(data.split(" ")[1]));
		}
		
		Arrays.sort(people, new Comparator<Person>() {
			@Override
			public int compare(BaekJoon20124.Person p1, BaekJoon20124.Person p2) {
				if (p1.score != p2.score) {
					return p1.score - p2.score;
				}
				else {
					return p2.name.compareTo(p1.name);
				}
			}
		});
		
		writer.write(people[N - 1].name);
		reader.close();
		writer.close();
	}

}