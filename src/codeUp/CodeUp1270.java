package codeUp;

import java.util.Scanner;

public class CodeUp1270{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        for(int i=1; i<=input; i++) {
        	if(i % 10 == 1) count++;
        }
        
        System.out.println(count);
        scanner.close();
    }
}
