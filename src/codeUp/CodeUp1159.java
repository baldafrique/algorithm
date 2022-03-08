package codeUp;

import java.util.Scanner;

public class CodeUp1159{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((50 <= num && num <= 70) || (num%6 == 0)) System.out.println("win");
        else System.out.println("lose");
        scanner.close();
    }
}
