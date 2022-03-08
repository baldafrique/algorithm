package codeUp;

import java.util.Scanner;

public class CodeUp1124{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        String m = "";
        String n = "";
        int index = 0;
        
        for(int i=1; i<input.length(); i++) {
        	if(input.charAt(i) != 'H') {
        		m += input.charAt(i);
        	}
        	else if(input.charAt(i) == 'H') {
        		index = i; 
        		break;
        	}
        }
        
        for(int i=index+1; i<input.length(); i++) n += input.charAt(i);
        
        int p = Integer.parseInt(m);
        int q = Integer.parseInt(n);
        int weight = p * 12 + q;
        System.out.println(weight);
        scanner.close();
    }
}