package algorithm;

import java.util.Scanner;

public class CodeUp1366{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++) {
        	for(int j=1; j<=num; j++) {
        		if((i==1) || (i==num) || (j==1) || (j==num) || (i==j) || (i==num/2+1) || (j==num/2+1) || (i==num+1-j)) System.out.print("*");
        		else System.out.print(" ");
        	}
        	System.out.println();
        }
        scanner.close();
    }
}