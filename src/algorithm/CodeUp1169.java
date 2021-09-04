package algorithm;

import java.util.Scanner;

public class CodeUp1169{
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        if(age > 13) {
        	System.out.print(113 - age +  " 1");
        }
        else {
        	System.out.print(13 - age +  " 3");
        }
        
        scanner.close();
    }
}
