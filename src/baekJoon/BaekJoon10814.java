package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon10814 {
	public static class Member {
		int age;
		String name;
		
		public Member(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		Member[] members = new Member[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			members[i] = new Member(Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken());
		}
		
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(BaekJoon10814.Member m1, BaekJoon10814.Member m2) {
				return m1.age - m2.age;
			}
		});
		
		for (Member member : members) {
			writer.write(member.age + " " + member.name + "\n");
		}
		writer.flush();
		reader.close();
		writer.close();
	}

}