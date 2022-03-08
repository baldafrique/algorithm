package codeUp;

import java.util.Scanner;

public class CodeUp1407{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replaceAll(" ", ""));
        scanner.close();
    }
}