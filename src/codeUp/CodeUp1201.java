package codeUp;

import java.util.Scanner;

public class CodeUp1201{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if(num > 0) System.out.println("양수");
        else if(num <0) System.out.println("음수");
        else System.out.println("0");
        scanner.close();
    }
}
