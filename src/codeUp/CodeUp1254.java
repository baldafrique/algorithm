package codeUp;

import java.util.Scanner;

public class CodeUp1254{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        int input3 = (int)input1.charAt(0);
        int input4 = (int)input2.charAt(0);
        for(int i=input3; i<=input4; i++) System.out.printf("%c ", i);        
        scanner.close();
    }
}
