package algorithm;

import java.util.Scanner;

public class CodeUp1035 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int hex = Integer.parseInt(input, 16);
        String octal = Integer.toOctalString(hex);
        System.out.println(octal);
	}

}
