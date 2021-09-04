package algorithm;

import java.util.Scanner;

public class CodeUp1356{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++) {
        	for(int j=0; j<num; j++) {
        		if(j == num-1) System.out.println("*");
        		else if(i == 0 || j == 0 || i == num-1) System.out.print("*");
        		else System.out.print(" ");
        	}
        }
        scanner.close();
    }
}