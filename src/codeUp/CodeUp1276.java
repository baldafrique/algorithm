package codeUp;

import java.util.Scanner;

public class CodeUp1276{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 1;
        for(int i=1; i<=input; i++) sum *= i;
        System.out.println(sum);
        scanner.close();
    }
}
