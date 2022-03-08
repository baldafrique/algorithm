package codeUp;

import java.util.Scanner;

public class CodeUp1267{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp;
        int sum = 0;
        
        for(int i=0; i<input; i++) {
        	temp = scanner.nextInt();
        	if(temp%5 == 0) sum+=temp;
        }
        
        System.out.println(sum);
        scanner.close();
    }
}
