package codeUp;

import java.util.Scanner;

public class CodeUp1158{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((30 <= num && num <= 40) || (60 <=num && num <= 70)) System.out.println("win");
        else System.out.println("lose");
        scanner.close();
    }
}
