package codeUp;

import java.util.Scanner;

public class CodeUp1378{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for(int i=num; i>0; i--) sum += i * (i+1) / 2;
        System.out.println(sum);
        scanner.close();
    }
}