package codeUp;

import java.util.Scanner;

public class CodeUp1121{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int remainder = num1 % num2;
        
        System.out.println(remainder);
        scanner.close();
    }
}