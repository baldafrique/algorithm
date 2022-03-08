package codeUp;

import java.util.Scanner;

public class CodeUp1353{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++) {
        	for(int j=num; j>=num-i; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}