package algorithm;

import java.util.Scanner;

public class CodeUp1253{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if(num1 < num2) for(int i=num1; i<=num2; i++) System.out.print(i + " ");
        else for(int i=num2; i<=num1; i++) System.out.print(i + " ");
        scanner.close();
    }
}
