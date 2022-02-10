package algorithm;

import java.util.Scanner;

public class CodeUp1164{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if(num1 <= 170 || num2 <= 170 || num3 <= 170) System.out.println("CRASH");
        else System.out.println("PASS");
        
        scanner.close();
    }
}
