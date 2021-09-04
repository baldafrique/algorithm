package algorithm;

import java.util.Scanner;

public class CodeUp1295{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for(int i=0; i<input.length(); i++) {
        	if(Character.isUpperCase(input.charAt(i))) System.out.print(Character.toLowerCase(input.charAt(i)));
        	else System.out.print(Character.toUpperCase(input.charAt(i)));
        scanner.close();
        }
    }
}