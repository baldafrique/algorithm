package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon11650 {
	public static class Point {
		int x, y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		Point[] points = new Point[N]; 
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
			points[i] = new Point(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
		}
		
		Arrays.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				if (p1.x != p2.x) {
					return p1.x - p2.x;
				}
				else {
					return p1.y - p2.y;
				}
			}
		});
		
		for (Point point : points) {
			writer.write(point.x + " " + point.y + "\n");
		}
		writer.flush();
		reader.close();
		writer.close();
	}

}