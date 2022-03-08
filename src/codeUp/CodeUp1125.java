package codeUp;

import java.util.Scanner;

public class CodeUp1125{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("%o %X", input, input);
        
        scanner.close();
    }
}