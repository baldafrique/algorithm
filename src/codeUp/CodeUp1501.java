package codeUp;

import java.util.Scanner;

public class CodeUp1501 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for(int i=1; i<=num*num; i++) {
    	System.out.print(i + " ");
    	if(i%num == 0) System.out.println();
    }
    scanner.close();
    }
}