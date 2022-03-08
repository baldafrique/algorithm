package codeUp;

import java.util.Scanner;

public class CodeUp1610 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    String[] input2 = input.split("");
    int index = scanner.nextInt();
    int num = scanner.nextInt();
    
    for(int i=index; i<index+num; i++) System.out.print(input2[i]);
    
    scanner.close();
    }
    
}

