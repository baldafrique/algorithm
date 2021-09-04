package algorithm;

import java.util.Scanner;

public class CodeUp1416{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
        scanner.close();
    }
}