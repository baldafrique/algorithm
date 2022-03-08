package codeUp;

import java.util.Scanner;

public class CodeUp1615 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
    scanner.close();
    }
    
    public static boolean check(int num) {
    	return true;
    }
    
    public static int sum(int input) {
    	if(input/10 != 0) {
    		int digit = 0;
            int quotient = 1;
            
            while(input/quotient != 0) {
            	digit++;
            	quotient *= 10;
            }
            
            quotient = 10;
            
            int[] num = new int[digit];
            for(int i=digit-1; i>=0; i--) {
            	num[i] = input % quotient;    	
            	input /= quotient;
            }
            
            input = 0;
            
            for(int i=0; i<digit; i++) {
            	input += num[i];
            }
        	return sum(input);	
    	}
    	else return input;
    	
    }
}

