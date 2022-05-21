package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon7568 {
	public static class Person {
		int weight;
		int height;
		
		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		Person[] people = new Person[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			int weight = Integer.parseInt(stringTokenizer.nextToken());
			int height = Integer.parseInt(stringTokenizer.nextToken());
			people[i] = new Person(weight, height);
		}
		
		for (int i = 0; i < N; i++) {
			int ranking = 1;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				else if (people[i].height < people[j].height && people[i].weight < people[j].weight) {
					ranking++;
				}
			}
			writer.write(ranking + " ");
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}

}