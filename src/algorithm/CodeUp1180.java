package algorithm;

import java.util.Scanner;

public class CodeUp1180{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tenth = num/10;
        int oneth = num%10;
        num = (oneth*10 + tenth) * 2;
        if(num < 100) System.out.println(num);
        else {
        	num -= 100;
        	System.out.println(num);
        }
        if(num > 50) System.out.println("OH MY GOD");
        else System.out.println("GOOD");
        scanner.close();
    }
}
