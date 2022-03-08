// WIP

package codeUp;

import java.util.Scanner;

public class CodeUp1287{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1; i<=9; i++) {
        	for(int j=1; j<=num*i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}
