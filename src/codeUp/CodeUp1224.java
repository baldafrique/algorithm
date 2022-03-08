package codeUp;

import java.util.Scanner;

public class CodeUp1224{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        float num5 = num1 * 1.0F / num2;
        float num6 = num3 * 1.0F / num4;
        
        if(num5 > num6) System.out.println(">");
        else if(num5 < num6) System.out.println("<");
        else System.out.println("=");
        
        scanner.close();
    }
}
