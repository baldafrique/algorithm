package algorithm;

import java.util.Scanner;

public class CodeUp1171{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.println(String.format("%d%02d%03d", num1, num2, num3));
        
        scanner.close();
    }
}
