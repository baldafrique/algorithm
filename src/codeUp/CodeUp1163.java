package codeUp;

import java.util.Scanner;

public class CodeUp1163{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int sum = year + month + day;
        
        if((sum/100)%2 == 0) System.out.println("대박");
        else System.out.println("그럭저럭");
        scanner.close();
    }
}
