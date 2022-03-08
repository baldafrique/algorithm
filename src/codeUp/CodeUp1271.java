package codeUp;

import java.util.Scanner;

public class CodeUp1271{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] num = new int[input];
        int max = 0;
        for(int i=0; i<input; i++) {
        	num[i] = scanner.nextInt();
        	if(i == 0) max = num[i];
        	else if(max < num[i]) max = num[i];
        }
        
        System.out.println(max);
        
        scanner.close();
    }
}
