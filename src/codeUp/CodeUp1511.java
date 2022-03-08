package codeUp;

import java.util.Scanner;

public class CodeUp1511{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        
        for(int i=1; i<=input*input; i++) {
        	if((i<=input) || (i%input == 0) || (i%input == 1) || (i >= input * input - input + 1)) sum += i;
        }
        System.out.println(sum);
        
        scanner.close();
    }
}
