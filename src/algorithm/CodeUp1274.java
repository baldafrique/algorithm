package algorithm;

import java.util.Scanner;

public class CodeUp1274{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i=2; i<input; i++) 
        	if(input % i == 0) {
        	System.out.println("not prime"); 
        	scanner.close();
        	return;
        }	
        System.out.println("prime");
        scanner.close();
    }
}
