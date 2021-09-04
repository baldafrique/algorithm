package algorithm;

import java.util.Scanner;

public class CodeUp1503{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        for(int i=1; i<=input; i++) {
        	for(int j=1; j<=input; j++) {
        		if(i%2 != 0) System.out.print((i-1) * input + j + " ");
        		else System.out.print(i * input - j+1 + " ");
        		if(j == input) System.out.println();
        	}
        }
        scanner.close();
    }
}
