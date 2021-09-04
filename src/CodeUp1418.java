package algorithm;

import java.util.Scanner;

public class CodeUp1418{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for(int i=0; i<input.length(); i++) {
        	if(input.charAt(i) == 't') System.out.print(i+1 + " ");
        }
        scanner.close();
    }
}