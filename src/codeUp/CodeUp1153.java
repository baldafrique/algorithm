package codeUp;

import java.util.Scanner;

public class CodeUp1153{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = num1;
        
        if(min > num2) min = num2;
        if(min > num3) min = num3;
        
        System.out.println(min);
        scanner.close();
    }
}
