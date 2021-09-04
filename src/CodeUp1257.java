package algorithm;

import java.util.Scanner;

public class CodeUp1257{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for(int i=num1; i<=num2; i++) if(i%2 != 0) System.out.print(i + " ");
        scanner.close();
    }
}
