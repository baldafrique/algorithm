package codeUp;

import java.util.Scanner;

public class CodeUp1160{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2 != 0) System.out.println("oh my god");
        else System.out.println("enjoy");
        scanner.close();
    }
}
