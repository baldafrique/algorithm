package codeUp;

import java.util.Scanner;

public class CodeUp1170{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.print(num1+""+num2);
        if(num3 < 10) System.out.println("0" + num3);
        else System.out.println(num3);
        
        scanner.close();
    }
}
