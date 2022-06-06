package baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon14173 {
	
	private static class Rectangle {
		int x1, y1, x2, y2;
		
		Rectangle(String x1, String y1, String x2, String y2) {
			this.x1 = Integer.parseInt(x1);
			this.y1 = Integer.parseInt(y1);
			this.x2 = Integer.parseInt(x2);
			this.y2 = Integer.parseInt(y2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer;
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		Rectangle rectangle1 = new Rectangle(
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken()
				);
		
		stringTokenizer = new StringTokenizer(reader.readLine());
		Rectangle rectangle2 = new Rectangle(
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken(),
				stringTokenizer.nextToken()
				);
		
		int leftTopX = rectangle1.x1 > rectangle2.x1 ? rectangle2.x1 : rectangle1.x1;
		int leftTopY = rectangle1.y2 > rectangle2.y2 ? rectangle1.y2 : rectangle2.y2;
		int rightBottomX = rectangle1.x2 > rectangle2.x2 ? rectangle1.x2 : rectangle2.x2;
		int rightBottomY = rectangle1.y1 > rectangle2.y1 ? rectangle2.y1 : rectangle1.y1;
		int sideX = rightBottomX - leftTopX;
		int sideY = leftTopY - rightBottomY;
		
		writer.write(Integer.toString((int) Math.pow(sideX > sideY ? sideX : sideY, 2)));
		reader.close();
		writer.close();
	}

}