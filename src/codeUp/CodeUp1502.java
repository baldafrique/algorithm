package codeUp;

import java.util.Scanner;

public class CodeUp1502 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for(int i=0; i<num; i++) {
    	for(int j=1; j<=num*num; j+=num) {
    		if(j+i == num * (num-1) + i+1) System.out.println(j+i);
    		else System.out.print(j+i + " ");
    		}
    	
    	}
    scanner.close();
    }
}