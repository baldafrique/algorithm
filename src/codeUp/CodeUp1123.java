package codeUp;

import java.util.Scanner;

public class CodeUp1123{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        float fahrenheit = 9.0F / 5 * celsius + 32;
        System.out.println(String.format("%.3f", fahrenheit));
        
        scanner.close();
    }
}