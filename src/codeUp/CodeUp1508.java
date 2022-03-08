package codeUp;

import java.util.Scanner;

public class CodeUp1508{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] num = new int[input][input];
        
        for(int i=0; i<input; i++) num[i][0] = scanner.nextInt();
        for(int i=0; i<input; i++) {
        	for(int j=0; j<input; j++) {
        		if((j != 0) && (i >= j)) num[i][j] = num[i][j-1] - num[i-1][j-1];  
        	}
        }
        
        for(int i=0; i<input; i++) {
        	for(int j=0; j<input; j++) {
        		if(num[i][j] != 0) System.out.print(num[i][j] + " ");
        		else System.out.print(" ");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}
