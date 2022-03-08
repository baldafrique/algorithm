package codeUp;

import java.util.Scanner;

public class CodeUp1216{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if(num <= 10) System.out.println("정상");
        else if(num <= 20) System.out.println("과체중");
        else System.out.println("비만");
        scanner.close();
    }
}
