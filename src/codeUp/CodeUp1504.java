package codeUp;

import java.util.Scanner;

public class CodeUp1504{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        int[][] num = new int[input][input];
        num[0][0] = 1;
        num[0][1] = input * 2;
        
        for(int i=2; i<input; i++) {
        	if(i%2 != 0) num[0][i] = num[0][i-2] + input * 2;
        	else num[0][i] = num[0][i-1] + 1;
        }
        
        for(int i=1; i<input; i++) {
        	for(int j=0; j<input; j++) {
        		if(j%2 == 0) num[i][j] = num[i-1][j] + 1;
        		else num[i][j] = num[i-1][j] - 1;
        	}
        }
        
        for(int i=0; i<input; i++) {
        	for(int j=0; j<input; j++) {
        		System.out.print(num[i][j] + " ");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}
