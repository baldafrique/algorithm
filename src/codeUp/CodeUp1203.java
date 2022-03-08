package codeUp;

import java.util.Scanner;

public class CodeUp1203{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int net = num2 - num3;
        
        if(num1 < net) System.out.println("advertise");
        else if(num1 > net) System.out.println("do not advertise");
        else System.out.println("does not matter");
        
        
        scanner.close();
    }
}
