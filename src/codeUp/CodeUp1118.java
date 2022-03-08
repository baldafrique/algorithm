package codeUp;

import java.util.Scanner;

public class CodeUp1118 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		float area = width * height / 2.0F;
		System.out.println(String.format("%.1f", area));
		scanner.close();
	}

}
