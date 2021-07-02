package algorithm;

import java.util.Scanner;

public class CodeUp1135{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if(num1 >= num2) System.out.println("1");
        else System.out.println("0");
        scanner.close();
    }
}