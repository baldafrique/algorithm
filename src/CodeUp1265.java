package algorithm;

import java.util.Scanner;

public class CodeUp1265{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        for(int i=1; i<=9; i++) System.out.println(input + "*" + i + "=" + input*i);
        scanner.close();
    }
}
