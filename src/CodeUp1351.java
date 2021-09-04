package algorithm;

import java.util.Scanner;

public class CodeUp1351{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        for(int i=num1; i<=num2; i++) {
        	for(int j=1; j<=9; j++) System.out.println(i + "*" + j + "=" + i*j);
        }
        scanner.close();
    }
}
